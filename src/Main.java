import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        LinkedList<Cpu> cpus = new LinkedList<>();
        LinkedList<MotherBoard> moBos = new LinkedList<>();
        LinkedList<GraphicCard> grCas = new LinkedList<>();
        LinkedList<Ram> rams = new LinkedList<>();
        LinkedList<Rom> roms = new LinkedList<>();

        Scanner sc = new Scanner(new File("C:\\Users\\yOu_NExT_XIII\\Desktop\\IdeaProjects\\SHPPO_LabRab1\\data\\cpu.txt"));
        while(sc.hasNext()){
            String[] paramCpu = sc.nextLine().split(", ");
            cpus.add(new Cpu("1" + Cpu.cpuCount, "Processor", paramCpu[0], paramCpu[1], paramCpu[2], paramCpu[3], paramCpu[4]));
        }

        sc = new Scanner(new File("C:\\Users\\yOu_NExT_XIII\\Desktop\\IdeaProjects\\SHPPO_LabRab1\\data\\motherBoard.txt"));
        while(sc.hasNext()){
            String[] paramMoBo = sc.nextLine().split(", ");
            moBos.add(new MotherBoard("2" + MotherBoard.moBoCount, "Mother Board", paramMoBo[0], paramMoBo[1], paramMoBo[2], paramMoBo[3], paramMoBo[4]));
        }

        sc = new Scanner(new File("C:\\Users\\yOu_NExT_XIII\\Desktop\\IdeaProjects\\SHPPO_LabRab1\\data\\graphicCard.txt"));
        while(sc.hasNext()){
            String[] paramGrCa = sc.nextLine().split(", ");
            grCas.add(new GraphicCard("3" + GraphicCard.grCaCount, "Graphic Card", paramGrCa[0], paramGrCa[1], paramGrCa[2]));
        }

        sc = new Scanner(new File("C:\\Users\\yOu_NExT_XIII\\Desktop\\IdeaProjects\\SHPPO_LabRab1\\data\\ram.txt"));
        while(sc.hasNext()){
            String[] paramRam = sc.nextLine().split(", ");
            rams.add(new Ram("4" + Ram.ramCount, "RAM", paramRam[0], paramRam[1], paramRam[2], paramRam[3]));
        }

        sc = new Scanner(new File("C:\\Users\\yOu_NExT_XIII\\Desktop\\IdeaProjects\\SHPPO_LabRab1\\data\\rom.txt"));
        while(sc.hasNext()){
            String[] paramRom = sc.nextLine().split(", ");
            roms.add(new Rom("5" + Rom.romCount, "ROM", paramRom[0], paramRom[1], paramRom[2]));
        }


        //Открытие потока ввода
        Scanner scanner = new Scanner(System.in);
        String input;    //Временная ссылка для хранения
        System.out.println("""
          
         	-Ну и зачем ты мне!? Что ты можешь???
         	-Что я могу? Я могу собрать для тебя ПК из комплектующих, которые ты сам добавишь) 
        	""");

        do {
            //справочная информация
            System.out.println("\nВиды комплектующих: ");
            System.out.print("""
                    
                    1 - CPU
                    2 - Mother Board
                    3 - Graphic Card
                    4 - RAM
                    5 - ROM
                    """);
            System.out.println("\nВведите 'Номер' выбранного вами типа, чтобы занести его в список комплектующих.");
            System.out.println("Введите 's', чтобы просмотреть текущий список.");
            System.out.println("Введите 'q', чтобы прекратить ввод и увидеть варианты сборки.");
            System.out.print("Ввод: ");

            input = scanner.nextLine();
            switch (input) {
                case ("1") -> {
                    do {
                        System.out.println("\nСписок CPU: ");
                        for (Cpu cpu : cpus) {
                            System.out.println(cpu);
                        }

                        System.out.println("\n\nВведите 'a', чтобы добавить в список новый CPU.");
                        System.out.println("Введите 'b', чтобы вернуться к выбору компонентов.");
                        System.out.println("Введите 'd', чтобы удалить последний добавленный CPU.");
                        System.out.print("Ввод: ");

                        input = scanner.nextLine();
                        switch (input) {
                            case ("a") -> {
                                System.out.print("\nВведите name: ");
                                String name = scanner.nextLine();

                                System.out.print("\nВведите manufacturerInformation: ");
                                String manufacturerInformation = scanner.nextLine();

                                System.out.print("\nВведите conCpuMoBo: ");
                                String conCpuMoBo = scanner.nextLine();

                                System.out.print("\nВведите conCpuGrCa: ");
                                String conCpuGrCa = scanner.nextLine();

                                System.out.print("\nВведите conCpuRam: ");
                                String conCpuRam = scanner.nextLine();

                                cpus.add(new Cpu("1" + Cpu.cpuCount, "Processor", name, manufacturerInformation, conCpuMoBo, conCpuGrCa, conCpuRam));
                            }

                            case ("d") -> cpus.removeLast();

                            case ("b") -> //Когда закончили ввод, то устанавливает флаг - выход
                                    input = "Назад";

                            default -> {
                                System.out.println("\n\n!!!ПРОИЗОШЛА ОШИБОЧКА ВВОДА!!!");
                                System.out.println("!!!     ПОПРОБУЙ ЗАНОВО    !!!\n\n");
                            }
                        }
                    } while (!input.equals("Назад"));
                }


                case ("2") -> {
                    do {
                        System.out.println("\nСписок Mother Board: ");
                        for (MotherBoard moBo : moBos) {
                            System.out.println(moBo);
                        }

                        System.out.println("\n\nВведите 'a', чтобы добавить в список новую Mother Board.");
                        System.out.println("Введите 'b', чтобы вернуться к выбору компонентов.");
                        System.out.println("Введите 'd', чтобы удалить последнюю добавленную Mother Board.");
                        System.out.print("Ввод: ");

                        input = scanner.nextLine();
                        switch (input) {
                            case ("a") -> {
                                System.out.print("\nВведите name: ");
                                String name = scanner.nextLine();

                                System.out.print("\nВведите manufacturerInformation: ");
                                String manufacturerInformation = scanner.nextLine();

                                System.out.print("\nВведите conCpuMoBo: ");
                                String conCpuMoBo = scanner.nextLine();

                                System.out.print("\nВведите conMoBoRam: ");
                                String conMoBoRam = scanner.nextLine();

                                System.out.print("\nВведите conMoBpRom: ");
                                String conMoBpRom = scanner.nextLine();

                                moBos.add(new MotherBoard("2" + MotherBoard.moBoCount, "Mother Board", name, manufacturerInformation, conCpuMoBo, conMoBoRam, conMoBpRom));
                            }

                            case ("d") -> moBos.removeLast();

                            //Когда закончили ввод, то устанавливает флаг - выход
                            case ("b") -> input = "Назад";


                            default -> {
                                System.out.println("\n\n!!!ПРОИЗОШЛА ОШИБОЧКА ВВОДА!!!");
                                System.out.println("!!!     ПОПРОБУЙ ЗАНОВО    !!!\n\n");
                            }
                        }
                    } while (!input.equals("Назад"));
                }


                case ("3") -> {
                    do {
                        System.out.println("\nСписок Graphic Card: ");
                        for (GraphicCard grCa : grCas) {
                            System.out.println(grCa);
                        }

                        System.out.println("\n\nВведите 'a', чтобы добавить в список новую Graphic Card.");
                        System.out.println("Введите 'b', чтобы вернуться к выбору компонентов.");
                        System.out.println("Введите 'd', чтобы удалить последнюю добавленную Graphic Card.");
                        System.out.print("Ввод: ");

                        input = scanner.nextLine();
                        switch (input) {
                            case ("a") -> {
                                System.out.print("\nВведите name: ");
                                String name = scanner.nextLine();

                                System.out.print("\nВведите manufacturerInformation: ");
                                String manufacturerInformation = scanner.nextLine();

                                System.out.print("\nВведите conCpuGrCa: ");
                                String conCpuGrCa = scanner.nextLine();

                                grCas.add(new GraphicCard("3" + GraphicCard.grCaCount, "Graphic Card", name, manufacturerInformation, conCpuGrCa));
                            }

                            case ("d") -> grCas.removeLast();

                            //Когда закончили ввод, то устанавливает флаг - выход
                            case ("b") -> input = "Назад";


                            default -> {
                                System.out.println("\n\n!!!ПРОИЗОШЛА ОШИБОЧКА ВВОДА!!!");
                                System.out.println("!!!     ПОПРОБУЙ ЗАНОВО    !!!\n\n");
                            }
                        }
                    } while (!input.equals("Назад"));
                }


                case ("4") -> {
                    do {
                        System.out.println("\nСписок RAM: ");
                        for (Ram ram : rams) {
                            System.out.println(ram);
                        }

                        System.out.println("\n\nВведите 'a', чтобы добавить в список новую RAM.");
                        System.out.println("Введите 'b', чтобы вернуться к выбору компонентов.");
                        System.out.println("Введите 'd', чтобы удалить последнюю добавленную RAM.");
                        System.out.print("Ввод: ");

                        input = scanner.nextLine();
                        switch (input) {
                            case ("a") -> {
                                System.out.print("\nВведите name: ");
                                String name = scanner.nextLine();

                                System.out.print("\nВведите manufacturerInformation: ");
                                String manufacturerInformation = scanner.nextLine();

                                System.out.print("\nВведите conCpuRam: ");
                                String conCpuRam = scanner.nextLine();

                                System.out.print("\nВведите conMoBoRam: ");
                                String conMoBoRam = scanner.nextLine();

                                rams.add(new Ram("4" + Ram.ramCount, "RAM", name, manufacturerInformation, conCpuRam, conMoBoRam));
                            }

                            case ("d") -> rams.removeLast();

                            //Когда закончили ввод, то устанавливает флаг - выход
                            case ("b") -> input = "Назад";

                            default -> {
                                System.out.println("\n\n!!!ПРОИЗОШЛА ОШИБОЧКА ВВОДА!!!");
                                System.out.println("!!!     ПОПРОБУЙ ЗАНОВО    !!!\n\n");
                            }
                        }
                    } while (!input.equals("Назад"));
                }


                case ("5") -> {
                    do {
                        System.out.println("\nСписок ROM: ");
                        for (Rom rom : roms) {
                            System.out.println(rom);
                        }

                        System.out.println("\n\nВведите 'a', чтобы добавить в список новую ROM.");
                        System.out.println("Введите 'b', чтобы вернуться к выбору компонентов.");
                        System.out.println("Введите 'd', чтобы удалить последнюю добавленную ROM.");
                        System.out.print("Ввод: ");

                        input = scanner.nextLine();
                        switch (input) {
                            case ("a") -> {
                                System.out.print("\nВведите name: ");
                                String name = scanner.nextLine();

                                System.out.print("\nВведите manufacturerInformation: ");
                                String manufacturerInformation = scanner.nextLine();

                                System.out.print("\nВведите conMoBoRom: ");
                                String conMoBoRom = scanner.nextLine();

                                roms.add(new Rom("5" + Rom.romCount, "ROM", name, manufacturerInformation, conMoBoRom));
                            }

                            case ("d") -> roms.removeLast();

                            //Когда закончили ввод, то устанавливает флаг - выход
                            case ("b") -> input = "Назад";

                            default -> {
                                System.out.println("\n\n!!!ПРОИЗОШЛА ОШИБОЧКА ВВОДА!!!");
                                System.out.println("!!!     ПОПРОБУЙ ЗАНОВО    !!!\n\n");
                            }
                        }

                    } while (!input.equals("Назад"));
                }


                case ("s") -> {
                    System.out.println("\nТекущий список комплектующих: ");

                    System.out.println("\nСписок CPU: ");
                    for(Cpu cpu : cpus){System.out.println(cpu);}

                    System.out.println("\nСписок Mother Board: ");
                    for(MotherBoard moBo : moBos){System.out.println(moBo);}

                    System.out.println("\nСписок Graphic Card: ");
                    for(GraphicCard grCa : grCas){System.out.println(grCa);}

                    System.out.println("\nСписок RAM: ");
                    for(Ram ram : rams){System.out.println(ram);}

                    System.out.println("\nСписок ROM: ");
                    for(Rom rom : roms){System.out.println(rom);}
                }

                //Когда закончили ввод, то устанавливает флаг - выход
                case ("q") -> input = "Выход";



                default -> {
                    System.out.println("\n\n!!!ПРОИЗОШЛА ОШИБОЧКА ВВОДА!!!");
                    System.out.println("!!!     ПОПРОБУЙ ЗАНОВО    !!!\n\n");
                }
            }
        } while (!input.equals("Выход"));

        int count = 0;
        for(Cpu cpu : cpus){
            for(MotherBoard moBo : moBos){
                for(GraphicCard grCa : grCas){
                    for(Ram ram : rams){
                        for(Rom rom : roms){
                            if (cpu.connect(grCa) && cpu.connect(moBo) && cpu.connect(ram) && moBo.connect(ram) && moBo.connect(rom)){
                                count++;
                                System.out.println("\nСборка ПК №" + count);
                                System.out.println(cpu);
                                System.out.println(moBo);
                                System.out.println(grCa);
                                System.out.println(ram);
                                System.out.println(rom + "\n");
                            }
                        }
                    }
                }
            }
        }
    }
}
