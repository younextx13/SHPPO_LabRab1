import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<Cpu> cpus = new LinkedList<>();
        LinkedList<MotherBoard> moBos = new LinkedList<>();
        LinkedList<GraphicCard> grCas = new LinkedList<>();
        LinkedList<Ram> rams = new LinkedList<>();
        LinkedList<Rom> roms = new LinkedList<>();

        //TODO: сделаю так, чтобы данные попадали в список из файла
        cpus.add(new Cpu("1" + Cpu.cpuCount, "Processor", "Core i7", "Intel", "Socket H", "GeForce", "3200"));
        cpus.add(new Cpu("1" + Cpu.cpuCount, "Processor", "Core i9", "Intel", "Socket H", "GeForce1", "4800"));
        cpus.add(new Cpu("1" + Cpu.cpuCount, "Processor", "Ryzen 5", "AMD", "AM4", "Radeon", "1600"));

        moBos.add(new MotherBoard("2" + MotherBoard.moBoCount, "Mother Board", "LPX", "ХЗ", "Socket H", "1650", "Sata 3"));
        moBos.add(new MotherBoard("2" + MotherBoard.moBoCount, "Mother Board", "LPX", "ХЗ", "AM4", "1650", "Sata 4"));
        moBos.add(new MotherBoard("2" + MotherBoard.moBoCount, "Mother Board", "LPX", "ХЗ", "Socket H", "1350", "Sata 3"));

        grCas.add(new GraphicCard("3" + GraphicCard.grCaCount, "Graphic Card", "GeForce", "Nvidia", "GeForce"));
        grCas.add(new GraphicCard("3" + GraphicCard.grCaCount, "Graphic Card", "Radeon", "AMD", "Radeon"));
        grCas.add(new GraphicCard("3" + GraphicCard.grCaCount, "Graphic Card", "GeForce", "Nvidia", "GeForce1"));

        rams.add(new Ram("4" + Ram.ramCount, "RAM", "DDR4", "ХЗ", "3200", "1650"));
        rams.add(new Ram("4" + Ram.ramCount, "RAM", "DDR3", "ХЗ", "4800", "1350"));
        rams.add(new Ram("4" + Ram.ramCount, "RAM", "DDRx3", "ХЗ", "1600", "1650"));

        roms.add(new Rom("5" + Rom.romCount, "ROM", "WD", "ХЗ", "Sata 4"));
        roms.add(new Rom("5" + Rom.romCount, "ROM", "WD1", "ХЗ", "Sata 3"));
        roms.add(new Rom("5" + Rom.romCount, "ROM", "WD2", "ХЗ", "Sata 3"));


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
