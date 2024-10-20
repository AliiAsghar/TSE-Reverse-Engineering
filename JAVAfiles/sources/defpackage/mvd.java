package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class mvd extends arrm implements arqv {
    public static final mvd a = new mvd();

    public mvd() {
        super(2, syc.class, "receivedTimestampEquals", "receivedTimestampEquals(J)Lcom/google/android/apps/messaging/shared/datamodel/databasegen/tabledefinitions/MessagesTable$WhereBuilder;", 0);
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        syc sycVar = (syc) obj;
        long longValue = ((Number) obj2).longValue();
        sycVar.getClass();
        sycVar.U(new agoi("messages.received_timestamp", 1, Long.valueOf(longValue)));
        return sycVar;
    }
}
