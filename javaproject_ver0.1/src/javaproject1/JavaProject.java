package javaproject1;

import java.util.Scanner;

public class JavaProject {

	public static Scanner sc = new Scanner(System.in);
	public static Group[] groupSet = new Group[3]; // �з�����
	public static Customer[] user = null; // ���� ������
	public static int[] classifyGroupA = null;
	public static int[] classifyGroupB = null;
	public static int[] classifyGroupC = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		int choice_sub = 0;
		String choice_group = null;
		int user_count = 0;

		while (true) {
			System.out.println("���θ޴��� �������ּ���");
			// ���θ޴�
			System.out.println("=================");
			System.out.println("1. �׷� �Է� \n2. ���� ���� �Է� \n3. �з� ��� ��� \n4. ����");
			System.out.println("=================");
			try {
				// ���θŴ� ����
				choice = sc.nextInt();
			} catch (Exception e) {
				sc.next();
				System.out.println("1 ~ 4 ���� �Է����ּ���.");
			}

			// ���θ޴� 1�� ����������
			if (choice == 1) {
				// ���ѹݸ�
				while (true) {
					// ���θ޴� 1 - 1
					System.out.println("=================");
					System.out.println("1.���� �׷� �з����� \n2.�׷� ������ ��� \n3.�׷쵥���� ���� \n4.�ڷΰ���");
					System.out.println("=================");
					// ����޴� ����
					try {
						choice_sub = sc.nextInt();
					} catch (Exception e) {
						sc.next();
						System.out.println("1 ~ 4 ���� �Է��ϼ���.");
					}
					// ����޴� 1-1 ����
					if (choice_sub == 1) {
						// ���ѹݸ�
						try {
							while (true) {
								System.out.println("A,B,C �߿� ������ �׷��� �Է��ϼ��� (�ڷ� ���� back) ");
								choice_group = sc.next();
								// A�� �Է������� �׷� ����
								if (choice_group.equals("A")) {
									groupSet[0] = groupDataInput();

									// B�� �Է������� �׷� ����
								} else if (choice_group.equals("B")) {
									groupSet[1] = groupDataInput();

									// C�� �Է������� �׷� ����
								} else if (choice_group.equals("C")) {
									groupSet[2] = groupDataInput();

									// �ڷΰ���
								} else if (choice_group.equals("back")) {
									System.out.println("���� �޴��� �̵� ...");
									break;
									// �߸��� ������ �Է������� �ٽ� �Է�
								} else {
									System.out.println("�߸��� ������ �Է�");
								}

							}
							// �������� �ٽ� ����
						} catch (Exception e) {
							sc.next();
							System.out.println("�����͸� �߸� �Է��߽��ϴ� �ٽ� �Է����ּ���");
						}
					}

					// ����޴� 1-2 ���� ���������� ���
					else if (choice_sub == 2) {
						System.out.println("A �׷���� " + groupSet[0]);
						System.out.println("B �׷���� " + groupSet[1]);
						System.out.println("C �׷���� " + groupSet[2]);

					}
					// ����޴� 1-3 ���ñ׷� �ٽ� ����
					else if (choice_sub == 3) {
						// �ݺ���
						try {
							while (true) {
								System.out.println("A,B,C �߿� �ٽ� ������ �׷��� �����Ͻÿ� (�ڷ� ���� " + " back)");
								// A B C �׷� �缳��
								choice_group = sc.next();
								// A�׷� ����
								if (choice_group.equals("A")) {
									groupDataPrint(0);
									// B�׷� ����
								} else if (choice_group.equals("B")) {
									groupDataPrint(1);
									// C�׷� ����
								} else if (choice_group.equals("C")) {
									groupDataPrint(2);
									// �ڷΰ���
								} else if (choice_group.equals("back")) {
									System.out.println("���� �޴��� �̵� ...");
									break;
									// �߸��Ȱ��� �Է������� �ٽ� �Է�
								} else {
									System.out.println("[����] A B C�߿� �Ѱ��� �Է����ּ��� ");
								}

							}
							// �������� �ٽ� ����
						} catch (Exception e) {
							sc.next();
							System.out.println("�����͸� �߸� �Է��߽��ϴ� �ٽ� �Է����ּ���");
						}
					}
					// �ڷΰ���
					else if (choice_sub == 4) {
						break;
						// �߸��Ȱ��� �Է������� �ٽ� �Է�
					} else {
						System.out.println("[����] �޴� �ٽ� �Է�");
					}
				}
				// ���θ޴����� 2�� ����������
			} else if (choice == 2) {
				// �ݺ���
				while (true) {
					// ���θ޴� 2
					System.out.println(choice);
					System.out.println("=================");
					System.out.println("1.�������� �Է� \n2.�������� ��� \n3.�������� ���� \n4.�ڷΰ���");
					System.out.println("=================");
					try {
						choice_sub = sc.nextInt();
					} catch (Exception e) {
						sc.next();
						System.out.println("[����] 1 ~ 4���� �Է����ּ���");
					}

					// ����޴� 2-1
					if (choice_sub == 1) {
						// �ڷΰ���
						// if (user_count == -1) {
						// break;
						// }
						// ���� �ݺ���
						
							while (true) {
								try {
								System.out.println("-1 �� �Է��ϸ� �ڷΰ��ϴ�");
								System.out.println("�������� �Է����ּ���");
								// ������ �Է� (ī��Ʈ)
								user_count = sc.nextInt();
							}catch (Exception e) {
								sc.next();
								System.out.println("[����] �ùٸ� �������� �Է����ּ���!");
							}
								// -1�� ������ �ڷΰ���

								if (user_count == -1)
									break;

								user = new Customer[user_count];
								// null�� �缳��
								for (int i = 0; i < user.length; i++) {
									user[i] = new Customer();
								}
								try {
								// ���� �����Է�
								for (int i = 0; i < user.length; i++) {
									System.out.printf("===== ���� %d�� ���� �Է�=====\n", i + 1);
									user[i] = userDataInput();
								}
								}catch (Exception e) {
									sc.next();
									System.out.println("[����] �ùٸ� ������ �Է����ּ���!");
								}

							}
							// �������� �ٽ� ����
						
					}
					// 2-2 ���� ���� ���
					else if (choice_sub == 2) {
						try {
							for (int i = 0; i < user.length; i++) {
								System.out.printf("%d�� %s", i + 1, user[i]);
							}
						} catch (Exception e) {
							System.out.println("[����] ���� ����Ÿ�� ���� �����ϴ�");
						}
					}
					// 2-3 ������ ���� �Է�
					else if (choice_sub == 3) {

						// ���� �ݺ���
						try {
							while (true) {
								for (int i = 0; i < user.length; i++) {
									System.out.printf("%d�� %s \n", i + 1, user[i]);
								}
								// ������ �������� ����
								System.out.println("������ ������ ��������");
								choice = sc.nextInt();
								if (!(choice > 0 && choice <= user.length)) {
									System.out.println("������ ���� ��ȣ�� �ٽ� �Է��Ͻÿ�");
									continue;

								}

								user[choice - 1] = userDataInput();
								for (int i = 0; i < user.length; i++) {
									System.out.printf("%d�� %s \n", i + 1, user[i]);
								}

								break;

							} // �������� �ٽ� ����
						} catch (Exception e) {
							sc.next();
							System.out.println("[����] �����͸� �߸� �Է��߽��ϴ� �ٽ� �Է����ּ���");
						}
						// ���θ޴� 4���� ������
					} else if (choice_sub == 4) {
						// �ڷΰ���
						break;
						// �߸��� ������ �Է½� �ٽ��Է�
					} else {
						System.out.println("[����] 1 ~ 4 ���ڸ� �Է��� �ּ���");
					}

				}
			}
			// ���� 3�� �������� ���

			else if (choice == 3) {
				try {
					classifyCustomer();
					for (int i = 0; i < classifyGroupA.length; i++) {
						System.out.printf("�׷�A %d %s \n", i + 1, user[classifyGroupA[i]]);

					}
					for (int i = 0; i < classifyGroupB.length; i++) {
						System.out.printf("�׷�B %d %s \n", i + 1, user[classifyGroupB[i]]);

					}
					for (int i = 0; i < classifyGroupC.length; i++) {
						System.out.printf("�׷�C %d %s \n", i + 1, user[classifyGroupC[i]]);

					}

				} catch (Exception e) {
					System.out.println("�׷쿡 ���յǴ� ������ �����ϴ�");
				}
			}
			// ����
			else if (choice == 4) {
				System.out.println("�ý����� ����Ǿ����ϴ�.");
				break;
			}

		}

	}

	// �������� �Է�
	public static Customer userDataInput() {
	
		System.out.println("����: ");
		int age = sc.nextInt();
		System.out.println("���� ");
		String gender = sc.next();
		System.out.println("���ͳ� �̿�ð�: ");
		int onlineTime = sc.nextInt();
		System.out.println("������: ");
		String city = sc.next();
		Customer customer_input = new Customer(age, gender, onlineTime, city);
		return customer_input;
	}

	// �������� ����
	// �������� ���
	public static void userDataPrint(int num) {
		user[num] = userDataInput();
		System.out.println(user[num]);

	}

	// �׷����� �Է�
	public static Group groupDataInput() {

		System.out.println("�ּҳ���: ");
		int ageMin = sc.nextInt();
		System.out.println("�ִ볪��: ");
		int ageMax = sc.nextInt();
		System.out.println("���� ");
		String gender = sc.next();
		System.out.println("���ͳ� �̿�ð�: ");
		int onlineTime = sc.nextInt();
		System.out.println("������: ");
		String city = sc.next();
		Group group_input = new Group(ageMin, ageMax, gender, onlineTime, city);
		return group_input;
	}

	// �������� ����
	// �������� ���
	public static void groupDataPrint(int num) {
		groupSet[num] = groupDataInput();
		System.out.println(groupSet[num]);

	}

	// �׷캰�� ������ ����
	public static void classifyCustomer() {
		int countA = 0;
		int countB = 0;
		int countC = 0;
		for (int uIdx = 0; uIdx < user.length; uIdx++) {
			if (groupCheck(user[uIdx], 0)) {
				countA++;
			} else if (groupCheck(user[uIdx], 1)) {
				countB++;
			} else if (groupCheck(user[uIdx], 2)) {
				countC++;
			}

		}

		classifyGroupA = new int[countA];
		classifyGroupB = new int[countB];
		classifyGroupC = new int[countC];

		countA = 0;
		countB = 0;
		countC = 0;
		// n�׷쿡 ������ �������� ī��Ʈ1��
		for (int uIdx = 0; uIdx < user.length; uIdx++) {
			if (groupCheck(user[uIdx], 0)) {
				classifyGroupA[countA++] = uIdx;
			} else if (groupCheck(user[uIdx], 1)) {
				classifyGroupB[countB++] = uIdx;
			} else if (groupCheck(user[uIdx], 2)) {
				classifyGroupC[countC++] = uIdx;
			}
		}

	}

	// �׷� �з� �Լ�
	public static boolean groupCheck(Customer user, int idx) {
		return groupSet[idx].getMinAge() <= user.getAge() && groupSet[idx].getMaxAge() >= user.getAge()
				&& groupSet[idx].getUi().getGender().equals(user.getUi().getGender())
				&& groupSet[idx].getUi().getOnlineTime() == user.getUi().getOnlineTime()
				&& groupSet[idx].getUi().getCity().equals(user.getUi().getCity());
	}
}
