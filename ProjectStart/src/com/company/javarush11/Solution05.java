package com.company.javarush11;

//    Исправь девять классов: Worker (сотрудник), Clerk (клерк), IT (ИТ-специалист), Programmer (программист), ProjectManager (менеджер проекта), CTO (технический директор), HR (рекрутер), OfficeManager (офис-менеджер), Cleaner (уборщик).
//    Унаследуй программиста, менеджера проекта и технического директора от ИТ-специалиста.
//    Унаследуй рекрутера, уборщика и офис-менеджера от клерка.
//    Унаследуй клерка и ИТ-специалиста от сотрудника.
/*
ИТ-компания
*/

public class Solution05 {
    public static void main(String[] args) {
    }

    public class Worker {

    }

    public class Clerk extends Worker{

    }

    public class IT extends Worker{

    }

    public class Programmer extends IT{

    }

    public class ProjectManager extends IT{

    }

    public class CTO extends IT{

    }

    public class OfficeManager extends Clerk{

    }

    public class HR extends Clerk{

    }

    public class Cleaner extends Clerk{

    }
}
