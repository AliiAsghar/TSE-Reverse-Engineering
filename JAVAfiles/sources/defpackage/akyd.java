package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akyd {
    public static final akye a;
    public static final akye b;
    public static final akye c;
    public static final akye d;
    public static final akye e;

    static {
        int i = 9;
        akye e2 = aohs.I("ListItem", new akxz(i)).e();
        a = e2;
        int i2 = 20;
        aohs I = aohs.I("ItemList", new agmr(i2));
        int i3 = 14;
        akxx akxxVar = new akxx(i3);
        int i4 = akxy.a;
        I.q("itemListElement", akxxVar, e2);
        I.e();
        int i5 = 4;
        akye e3 = aohs.I("OrderItem", new akxz(i5)).e();
        b = e3;
        int i6 = 6;
        akye e4 = aohs.I("Organization", new akxz(i6)).e();
        c = e4;
        aohs J = aohs.J("ParcelDelivery");
        int i7 = 13;
        J.o("deliveryAddress", new akya(i7));
        J.p("expectedArrivalFrom", new akya(i3));
        int i8 = 5;
        J.p("expectedArrivalUntil", new akxx(i8));
        J.o("hasDeliveryMethod", new akxx(i6));
        int i9 = 7;
        J.o("trackingNumber", new akxx(i9));
        int i10 = 8;
        J.o("trackingUrl", new akxx(i10));
        akye e5 = J.e();
        d = e5;
        int i11 = 19;
        aohs I2 = aohs.I("Order", new agmr(i11));
        I2.p("orderDate", new akxx(i));
        int i12 = 10;
        I2.n("orderDelivery", new akxx(i12), e5);
        int i13 = 11;
        I2.q("orderedItem", new akxx(i13), e3);
        I2.j("orderStatus", new akxx(12));
        I2.n("seller", new akxx(i7), e4);
        I2.e();
        int i14 = 1;
        aohs I3 = aohs.I("Person", new akxz(i14));
        I3.o("email", new akxx(15));
        int i15 = 16;
        I3.o("telephone", new akxx(i15));
        I3.o("name", new akxx(17));
        I3.e();
        int i16 = 0;
        aohs I4 = aohs.I("Timer", new akxz(i16));
        I4.j("timerStatus", new akxx(18));
        I4.i(new akxx(i11));
        I4.e();
        int i17 = 2;
        aohs I5 = aohs.I("CalendarEvent", new akxz(i17));
        I5.p("startDate", new akxx(i2));
        I5.p("endDate", new akya(i14));
        I5.q("attendee", new akya(i16), new akyc());
        I5.e();
        int i18 = 3;
        aohs I6 = aohs.I("SafetyCheck", new akxz(i18));
        I6.i(new akya(i17));
        I6.p("checkinTime", new akya(i18));
        I6.e();
        aohs I7 = aohs.I("Schedule", new akxz(i8));
        I7.k("startDate", new akya(i5));
        I7.l("startTime", new akya(i8));
        I7.k("endDate", new akya(i6));
        I7.l("endTime", new akya(i9));
        I7.h("scheduleTimezone", new agoq(new akya(i10), i15), new akyf());
        I7.h("repeatFrequency", new akyh(new akya(i), i17), new akyf());
        I7.m("byDay", new akya(i12), new akyh(new akya(i13), i8));
        akye e6 = I7.e();
        e = e6;
        aohs I8 = aohs.I("Alarm", new akxz(i10));
        I8.n("alarmSchedule", new akya(12), e6);
        I8.e();
    }
}
