package Interfaces;

public abstract interface Youtube extends Videoeditor {
		abstract void make_video();
		default void uploardvideo() {
			System.out.println("youtuber is uploarding video ");
		}
}
