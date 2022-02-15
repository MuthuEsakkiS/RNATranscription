class RnaTranscription {

    String transcribe(String dnaStrand) {
        String result = "";
        for(int position = 0; position < dnaStrand.length(); position++) {
            if(dnaStrand.charAt(position) == 'G') {
                result += "C";
            }
            else if(dnaStrand.charAt(position) == 'C') {
                result += "G";
            }
            else if(dnaStrand.charAt(position) == 'T') {
                result += "A";
            }
            else if(dnaStrand.charAt(position) == 'A') {
                result += "U";
            }
        }
        return result;
    }

}
