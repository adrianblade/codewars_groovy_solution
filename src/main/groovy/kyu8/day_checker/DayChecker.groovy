class DayChecker{
    static Boolean isToday(date){
        def today = new Date().clearTime()
        System.out.println("TODAY:" + today)
        System.out.println("DATE:" + date)
        return today.compareTo(date.clearTime()) == 0;
    }

    static Boolean isToday2(date){
        date.format('yyyyMMdd') == new Date().format('yyyyMMdd')
    }

    static Boolean isToday3(date){
        return date.dateString == new Date().dateString
    }

    static Boolean isToday4(date){
        def today = new Date()
        return today - date == 0
    }
}