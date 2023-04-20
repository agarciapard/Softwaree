
class C1{
public static String salidaHTML(String dim){
int n=Integer.parseInt(dim);
String out="<html>";
int a= 0
for (int i=1; i<=n;i++){
out =out+ "<A HREF=S1>Crear matriz "+i+"X"+i+"</A><br>";
}
out =out+"</html>";
return out;
}
}