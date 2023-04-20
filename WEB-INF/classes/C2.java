class C2 {
    public static String salidaHTML(String dimensiones, String escala) {
        int dim = Integer.parseInt(dimensiones);
        int esc = Integer.parseInt(escala);
        String out = "";
        out +="<html>";
        out +="<head>";
        out +="<title>S2 Encuestas</title>";
		out +="</head>";
        out +="<form action=http://nicolasserrano.github.io/CS/HTML/query.html  method='GET'>";
        out +="<CENTER><TABLE BORDER=1>";
        for (int i=1; i<dim; i++) {
            out +="<tr>";
            for (int j =1; j<esc+1; j++) {
			if (j==1){
				out+= "<td><P>Dim "+i+"</P></td>";
            }else{
				int var=j-1;
                out+= "<td><input TYPE='radio' NAME='v_"+var+"' value='1'></td>";
			}
		}
		out +="</tr>";
        }
        out +="</form>";
        out +="</body>";
        out +="<input type='submit' value='Enviar' >";
        out +="</html>";
        return out;
    }
}