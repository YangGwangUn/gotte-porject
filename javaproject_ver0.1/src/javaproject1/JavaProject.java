package javaproject1;

import java.util.Scanner;

public class JavaProject {

	public static Scanner sc = new Scanner(System.in);
	public static Group[] groupSet = new Group[3]; // 분류기준
	public static Customer[] user = null; // 고객 데이터
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
			System.out.println("메인메뉴를 선택해주세요");
			// 메인메뉴
			System.out.println("=================");
			System.out.println("1. 그룹 입력 \n2. 고객 정보 입력 \n3. 분류 결과 출력 \n4. 종료");
			System.out.println("=================");
			try {
			// 메인매뉴 선택
			choice = sc.nextInt();
			}catch (Exception e) {
				sc.next();
				System.out.println("1 ~ 4 까지 입력해주세요.");
			}
			

			// 메인메뉴 1을 선택했을때
			if (choice == 1) {
				// 무한반목문
				while (true) {
					// 메인메뉴 1 - 1
					System.out.println("=================");
					System.out.println("1.고객 그룹 분류기준 \n2.그룹 데이터 출력 \n3.그룹데이터 수정 \n4.뒤로가기");
					System.out.println("=================");
					// 서브메뉴 선택
					try {
					choice_sub = sc.nextInt();
					}catch (Exception e) {
						sc.next();
						System.out.println("1 ~ 4 까지 입력하세요.");
					}
					// 서브메뉴 1-1 선택
					if (choice_sub == 1) {
						// 무한반목문
						try {
							while (true) {
								System.out.println("A,B,C 중에 설정할 그룹을 입력하세요 (뒤로 가기 back) ");
								choice_group = sc.next();
								// A를 입력했을때 그룹 설정
								if (choice_group.equals("A")) {
									groupSet[0] = groupDataInput();

									// B를 입력했을때 그룹 설정
								} else if (choice_group.equals("B")) {
									groupSet[1] = groupDataInput();

									// C를 입력했을때 그룹 설정
								} else if (choice_group.equals("C")) {
									groupSet[2] = groupDataInput();

									// 뒤로가기
								} else if (choice_group.equals("back")) {
									System.out.println("이전 메뉴로 이동 ...");
									break;
									// 잘못된 데이터 입력했을때 다시 입력
								} else {
									System.out.println("잘못된 데이터 입력");
								}

							}
							// 오류날때 다시 쓰기
						} catch (Exception e) {
							sc.next();
							System.out.println("데이터를 잘못 입력했습니다 다시 입력해주세요");
						}
					}

					// 서브메뉴 1-2 선택 설정데이터 출력
					else if (choice_sub == 2) {
						System.out.println("A 그룹기준 " + groupSet[0]);
						System.out.println("B 그룹기준 " + groupSet[1]);
						System.out.println("C 그룹기준 " + groupSet[2]);

					}
					// 서브메뉴 1-3 선택그룹 다시 설정
					else if (choice_sub == 3) {
						// 반복문
						try {
							while (true) {
								System.out.println("A,B,C 중에 다시 설정할 그룹을 선택하시오 (뒤로 가기 " + " back)");
								// A B C 그룹 재설정
								choice_group = sc.next();
								// A그룹 설정
								if (choice_group.equals("A")) {
									groupDataPrint(0);
									// B그룹 설정
								} else if (choice_group.equals("B")) {
									groupDataPrint(1);
									// C그룹 설정
								} else if (choice_group.equals("C")) {
									groupDataPrint(2);
									// 뒤로가기
								} else if (choice_group.equals("back")) {
									System.out.println("이전 메뉴로 이동 ...");
									break;
									// 잘못된값을 입력했을때 다시 입력
								} else {
									System.out.println("다시 입력");
								}

							}
							// 오류날때 다시 쓰기
						} catch (Exception e) {
							sc.next();
							System.out.println("데이터를 잘못 입력했습니다 다시 입력해주세요");
						}
					}
					// 뒤로가기
					else if (choice_sub == 4) {
						break;
						// 잘못된값을 입력했을때 다시 입력
					} else {
						System.out.println("메뉴 다시 입력");
					}
				}
				// 메인메뉴에서 2를 선택했을때
			} else if (choice == 2) {
				// 반복문
				while (true) {
					// 메인메뉴 2
					System.out.println(choice);
					System.out.println("=================");
					System.out.println("1.고객정보 입력 \n2.고객정보 출력 \n3.고객정보 수정 \n4.뒤로가기");
					System.out.println("=================");
					try {
					choice_sub = sc.nextInt();
					}catch (Exception e) {
						sc.next();
						System.out.println("1 ~ 4까지 입력해주세");
					}

					// 서브메뉴 2-1
					if (choice_sub == 1) {
						// 뒤로가기
						// if (user_count == -1) {
						// break;
						// }
						// 무한 반복문
						try {
							while (true) {
								System.out.println("-1 를 입력하면 뒤로갑니다");
								System.out.println("고객수를 입력해주세요");
								// 고객수 입력 (카운트)
								user_count = sc.nextInt();
								// -1을 누르면 뒤로가기

								if (user_count == -1)
									break;

								user = new Customer[user_count];
								// null값 재설정
								for (int i = 0; i < user.length; i++) {
									user[i] = new Customer();
								}
								// 고객 정보입력
								for (int i = 0; i < user.length; i++) {
									System.out.printf("===== 고객 %d번 정보 입력=====\n", i + 1);
									user[i] = userDataInput();
								}

							}
							// 오류날때 다시 쓰기
						} catch (Exception e) {
							sc.next();
							System.out.println("데이터를 잘못 입력했습니다 다시 입력해주세요");
						}
					}
					// 2-2 고객 정보 출력
					else if (choice_sub == 2) {
						for (int i = 0; i < user.length; i++) {
							System.out.printf("%d번 %s", i + 1, user[i]);
						}
					}
					// 2-3 수정할 고객 입력
					else if (choice_sub == 3) {

						// 무한 반복문
						try {
							while (true) {
								for (int i = 0; i < user.length; i++) {
									System.out.printf("%d번 %s \n", i + 1, user[i]);
								}
								// 수정할 고객정보 선택
								System.out.println("수정할 고객을 고르세요");
								choice = sc.nextInt();
								if (!(choice > 0 && choice <= user.length)) {
									System.out.println("수정할 고객 번호를 다시 입력하시오");
									continue;

								}

								user[choice - 1] = userDataInput();
								for (int i = 0; i < user.length; i++) {
									System.out.printf("%d번 %s \n", i + 1, user[i]);
								}

								break;

							} // 오류날때 다시 쓰기
						} catch (Exception e) {
							sc.next();
							System.out.println("데이터를 잘못 입력했습니다 다시 입력해주세요");
						}
						// 메인메뉴 4번을 누르면
					} else if (choice_sub == 4) {
						// 뒤로가기
						break;
						// 잘못된 데이터 입력시 다시입력
					} else {
						System.out.println("오류 다시 입력");
					}

				}
			}
			// 메인 3번 고객정보 출력

			else if (choice == 3) {
				try {
				classifyCustomer();
				for (int i = 0; i < classifyGroupA.length; i++) {
					System.out.printf("그룹A %d %s \n", i + 1, user[classifyGroupA[i]]);
					

				}
				for (int i = 0; i < classifyGroupB.length; i++) {
					System.out.printf("그룹B %d %s \n", i + 1, user[classifyGroupB[i]]);

				}
				for (int i = 0; i < classifyGroupC.length; i++) {
					System.out.printf("그룹C %d %s \n", i + 1, user[classifyGroupC[i]]);

				}

			}catch (Exception e) {
				System.out.println("그룹에 부합되는 고객이 없습니다");
			}
			}
			// 종료
			else if (choice == 4) {
				System.out.println("시스템이 종료되었습니다.");
				break;
			}

		}

	}

	// 고객정보 입력
	public static Customer userDataInput() {
		System.out.println("나이: ");
		int age = sc.nextInt();
		System.out.println("성별 ");
		String gender = sc.next();
		System.out.println("인터넷 이용시간: ");
		int onlineTime = sc.nextInt();
		System.out.println("거주지: ");
		String city = sc.next();
		Customer customer_input = new Customer(age, gender, onlineTime, city);
		return customer_input;
	}

	// 고객정보 수정
	// 고객정보 출력
	public static void userDataPrint(int num) {
		user[num] = userDataInput();
		System.out.println(user[num]);

	}

	// 그룹정보 입력
	public static Group groupDataInput() {
		System.out.println("최소나이: ");
		int ageMin = sc.nextInt();
		System.out.println("최대나이: ");
		int ageMax = sc.nextInt();
		System.out.println("성별 ");
		String gender = sc.next();
		System.out.println("인터넷 이용시간: ");
		int onlineTime = sc.nextInt();
		System.out.println("거주지: ");
		String city = sc.next();
		Group group_input = new Group(ageMin, ageMax, gender, onlineTime, city);
		return group_input;
	}

	// 고객정보 수정
	// 고객정보 출력
	public static void groupDataPrint(int num) {
		groupSet[num] = groupDataInput();
		System.out.println(groupSet[num]);

	}

	// 그룹별로 고객수 저장
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
		// n그룹에 고객이 들어갈때마다 카운트1씩
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

	// 그룹 분류 함수
	public static boolean groupCheck(Customer user, int idx) {
		return groupSet[idx].getMinAge() <= user.getAge() && groupSet[idx].getMaxAge() >= user.getAge()
				&& groupSet[idx].getUi().getGender().equals(user.getUi().getGender())
				&& groupSet[idx].getUi().getOnlineTime() == user.getUi().getOnlineTime()
				&& groupSet[idx].getUi().getCity().equals(user.getUi().getCity());
	}
}
