package ru.job4j.set;

import org.junit.Test;

import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FirewallTest {
    @Test
    public void checkName() {
        Set<String> words = Set.of("instagram", "����", "���", "�����");
        String s = "�������� ��������������� Gradle ������� SpringBoot + Angular � IDEA";
        String rsl = Firewall.checkName(s, words);
        assertThat(rsl, is("�� ������� ���������� �����!"));
    }

    @Test
    public void checkNameFalse() {
        Set<String> words = Set.of("instagram", "����", "���", "�����");
        String s = "��������� ������� ����������� ����� ���������� � ������ � instagram";
        String rsl = Firewall.checkName(s, words);
        assertThat(rsl, is("�������� ������ ������..."));
    }
}