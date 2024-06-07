

//Write your code here
class MyRegex{
    String ipPart = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = "(" + ipPart + "\\.){3}" + ipPart;
}
