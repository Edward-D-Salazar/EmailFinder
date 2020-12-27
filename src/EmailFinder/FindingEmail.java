package EmailFinder;

public class FindingEmail {
	
		String[] emails;
	
		int nextIndex = 0;
		int arraySize = 0;
	
		public FindingEmail(int size){
		
			this.emails = new String[size];
		}
	
		public void addEmail(String email) {
		
			this.emails[this.nextIndex] = email;
			this.nextIndex++;
			if(this.nextIndex == this.arraySize) {
			this.nextIndex = 0;
			}
		
		}
	
		public void printEmails() {
			for(int i = 0; i < this.emails.length; i++) {
				if(null == this.emails[i]) {
					continue;
				}
				System.out.println(this.emails[i]);
			}
		}
	
		public boolean foundMatch(String input) {
			for(int i = 0; i < this.emails.length; i++) {
				if(null == this.emails[i]) {
					continue;
				}
				if(this.emails[i].equalsIgnoreCase(input)) {
					return true;
				}
			}
			return false;
	}
}
