public class Ex05 {
    public static void main(String[] args) {
        // header
        System.out.println("Content-Type: text/html");

        // blank line
        System.out.println();

        // Corpo da resposta HTML
        System.out.println("<html>");
        System.out.println("<head><title>Saudação CGI</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>Olá, Terráqueos!</h1>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}