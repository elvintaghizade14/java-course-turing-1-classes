package az.edu.turing.module04._m03lesson12;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.function.BiFunction;

public class CalcServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        // 1. input
        // request variables:
        String x = req.getParameter("x");
        String y = req.getParameter("y");
        String op = req.getParameter("op");

        // 2. process
        Calculator calculator = new Calculator();
        String result = calculator.doOp(x, y, op);

        // 3. output
        try (OutputStream os = resp.getOutputStream()) {
            os.write(result.getBytes());
            int status = Integer.parseInt(result.split(";")[1]);
            resp.setStatus(status);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class Calculator {

        public String doOp(String xs, String ys, String op) {
            String result;

            try {
                int x = toInt(xs);
                int y = toInt(ys);
                int r = doParse(x, y, op);
                result = String.valueOf(r);

            } catch (NumberFormatException nfe) {
                result = "You entered wrong number!;400";
            } catch (IllegalArgumentException iae) {
                result = iae.getMessage() + ";500";
            } catch (ArithmeticException ae) {
                result = "Divide by zero not allowed!;400";
            } catch (Exception ge) {
                result = "Internal server error!;500";
            }

            return result;
        }

        private int toInt(final String original) throws NumberFormatException {
            return Integer.parseInt(original);
        }

        private int doParse(final int x, final int y, final String op) throws IllegalArgumentException {
            switch (op.toLowerCase()) {
                case "sum":
                    return doCore(x, y, (a, b) -> (a + b));
                case "sub":
                    return doCore(x, y, (a, b) -> (a - b));
                case "mul":
                    return doCore(x, y, (a, b) -> (a * b));
                case "div":
                    return doCore(x, y, (a, b) -> (a / b));
                case "mod":
                    return doCore(x, y, (a, b) -> (a % b));
                default:
                    throw new IllegalArgumentException("No operation type found!");
            }
        }

        private int doCore(final int x, final int y, final BiFunction<Integer, Integer, Integer> f) throws ArithmeticException {
            return f.apply(x, y);
        }
    }
}
