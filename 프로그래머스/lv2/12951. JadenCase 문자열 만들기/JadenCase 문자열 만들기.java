class Solution {
    public String solution(String s) {
       StringBuilder answer = new StringBuilder();

	String[] word = s.split(" ");

	for (String value : word) {
		if(value.equals(""))
			answer.append(" ");
		else
			answer.append(jadenCase(value)).append(" ");
	}

	if(s.charAt(s.length()-1) == ' ')
		return answer.substring(0, answer.length());

	return answer.substring(0, answer.length()-1);
    }
    public String jadenCase(String str){
	StringBuilder jaden = new StringBuilder();

	str = str.toLowerCase();
	String sub = str.substring(0, 1);

	jaden.append(sub.toUpperCase());
	jaden.append(str.substring(1));

	return jaden.toString();
}
}