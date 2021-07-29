class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        String sign = (numerator != 0) && (numerator < 0 ^ denominator < 0) ? "-" : "";
        long absNum = Math.abs((long) numerator), absDen = Math.abs((long) denominator);
        String integerPart = String.valueOf(absNum / absDen);
        
        if(absNum % absDen == 0) {
            return sign + integerPart;
        }
        
        StringBuilder decimalPart = new StringBuilder();    
        long reminder = absNum % absDen;        
        
        Map<Long, Integer> reminderPositions = new HashMap<>();
        
        while(reminder != 0) {
            if(reminderPositions.containsKey(reminder)) {
                decimalPart.insert(reminderPositions.get(reminder), "(");
                decimalPart.append(")");
                break;
            }
            
            reminderPositions.put(reminder, decimalPart.length());
            decimalPart.append(String.valueOf(reminder * 10 / absDen));
            reminder = (reminder * 10) % absDen;
        }
        
        return sign + integerPart + "." + decimalPart.toString();
    }
}