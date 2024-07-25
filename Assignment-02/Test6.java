import java.util.Scanner;

class Test6 {
    public static void main(String[] args) {
		
		String mesha = "2024 will bring significant improvements in your attitudes and behaviors, allowing you to work more intelligently and move away from confusion and aimlessness. This year is excellent for starting new ventures, finding unique employment opportunities, and achieving promotions, particularly favorable for those in education or appearing for competitive exams. Health-wise, be cautious about digestive issues and prioritize healthy eating. Women hoping for children should get relevant check-ups. Overall, it's a promising start to the year, with further improvements expected after April.";
        String wrushaba = "After experiencing significant stress, this year brings favorable planetary movements, offering relief and progress. It's a good period for income generation and business growth. Positive developments are expected in professional, social, and political activities. Those in the arts and literature will find this period highly beneficial. Expect beneficial changes in marriage and education, making this a transformative year.";
        String mithuna = "For Mithuna (Gemini) individuals, 2024 will be a year of intellectual and personal growth. Opportunities for higher education and learning will be abundant. Success is likely in creative fields and communications. Maintaining a balanced diet and regular exercise will be essential for good health. This year encourages exploring new ideas and expanding your knowledge base, making it a time of significant growth and development.";
        String kataka = "Kataka (Cancer) natives can expect a focus on family relationships and home improvements in 2024. Stability in career is likely, with opportunities for advancement presenting themselves. Health-wise, be mindful of stress-related issues and practice relaxation techniques to maintain overall well-being. This year will be centered around nurturing personal relationships and creating a harmonious home environment.";
        String singhe = "For Singha (Leo) individuals, 2024 is a year to take on leadership roles and showcase talents. Opportunities in management and leadership positions will arise, making it a favorable time for career growth. Health should be maintained through a healthy lifestyle and regular check-ups. This year will highlight your leadership abilities and provide platforms for you to shine.";
        String kanya = "Kanya (Virgo) natives will find success through meticulous planning and organization in 2024. This year is favorable for growth in analytical and research fields. Mental health and stress management should be prioritized to maintain overall well-being. Attention to detail and a methodical approach will be key to achieving success this year.";
        String thula = "Thula (Libra) individuals will work towards achieving balance in their personal and professional lives in 2024. Success will come through partnerships and collaborative projects. Maintaining a balanced diet and regular exercise will be important for health. This year emphasizes finding harmony and working effectively with others to achieve mutual goals.";
        String wrushchika = "Vrushchika (Scorpio) natives will undergo personal transformation and self-discovery in 2024. Opportunities in research and investigative fields will be prominent. Emotional well-being should be a focus to maintain good health. This year will be a time of deep personal growth and exploring new dimensions of yourself.";
        String danu = "For Danu (Sagittarius) individuals, 2024 will be a year of exploration and adventure. Success in travel and education-related fields is likely. Staying active and exploring new fitness routines will be beneficial for health. This year encourages you to embrace new experiences and broaden your horizons.";
        String makara = "Makara (Capricorn) natives will achieve success through discipline and hard work in 2024. Opportunities in finance and management will arise. Focus on bone and joint health to maintain overall well-being. This year will highlight your ability to achieve long-term goals through perseverance and dedication.";
        String kumbha = "Kumbha (Aquarius) individuals will experience a year of innovation and creative thinking in 2024. Success in technology and humanitarian fields is likely. Staying hydrated and maintaining a healthy diet will be important for health. This year encourages you to think outside the box and contribute to innovative projects.";
        String meena = "For Meena (Pisces) natives, 2024 will be a year to rely on intuition and pursue spiritual growth. Opportunities in artistic and healing professions will be prominent. Practice mindfulness and meditation to maintain good health. This year will be about connecting with your inner self and exploring your spiritual side.";
        
        Scanner sc = new Scanner(System.in);
		System.out.print("1.MESHA \n2.WRUSHABHA \n3.MITHUNA \n4.KATAKA \n5.SINGHE \n6.KANYA \n7.THULA \n8.WRUSHCHIKA \n9.DANU \n10.MAKARA \n11.KUNBHA \n12.MEENA \nEnter Related NUMBER of Your Lagna : ");
		int lagna = sc.nextInt();

		if(lagna == 1){
			System.out.println(mesha);
			}else if(lagna == 2){
			System.out.println(wrushaba);
			}else if(lagna == 3){
			System.out.println(mithuna);
			}else if(lagna == 4){
			System.out.println(kataka);
			}else if(lagna == 5){
			System.out.println(singhe);
			}else if(lagna == 6){
			System.out.println(kanya);
			}else if(lagna == 7){
			System.out.println(thula);
			}else if(lagna == 8){
			System.out.println(wrushchika);
			}else if(lagna == 9){
			System.out.println(danu);
			}else if(lagna == 10){
			System.out.println(makara);
			}else if(lagna == 11){
			System.out.println(kumbha);
			}else if(lagna == 12){
			System.out.println(meena);
			}else{
				System.out.println("Error...You Entered Invalid number!");
				}
			
			
	}
}
	
	
