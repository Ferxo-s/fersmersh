//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Cuantos popochos tienes :");
    int popochos = scan.nextInt();
    scan.nextLine();
    String ZZ="Zzz";
    if (popochos==1){
        System.out.println("El popocho esta demasiado mimado :3");
    }
    else if(popochos<=3){
        System.out.println("La familia esta equilibrada <3");
    }
    else if (popochos>=4){
        System.out.println("La familia tiene demasiados popochos NO HAY MIMOS PARA TODOS");
    }
    else {
        System.out.println("No tienes ningun popocho ADOPTA UNO");
    }
    System.out.printf("LA vida es bella pero mas bella es mi doncella");
    System.out.println("Me gustan los pies no puedo mentir");
    for (int i =1;i<=popochos;i++){
        System.out.println("El popocho "+i+" esta dormido :"+ZZ);
        ZZ+="Zzz";
    }
}
