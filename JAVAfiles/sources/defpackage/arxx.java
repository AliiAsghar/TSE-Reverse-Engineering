package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arxx {
    public static final asfn a = new asfn("COMPLETING_ALREADY");
    public static final asfn b = new asfn("COMPLETING_WAITING_CHILDREN");
    public static final asfn c = new asfn("COMPLETING_RETRY");
    public static final asfn d = new asfn("TOO_LATE_TO_CANCEL");
    public static final asfn e = new asfn("SEALED");
    public static final arww f = new arww(false);
    public static final arww g = new arww(true);

    public static final Object a(Object obj) {
        if (obj instanceof arxi) {
            return new arxj((arxi) obj);
        }
        return obj;
    }

    public static final Object b(Object obj) {
        arxj arxjVar;
        arxi arxiVar;
        if (obj instanceof arxj) {
            arxjVar = (arxj) obj;
        } else {
            arxjVar = null;
        }
        if (arxjVar != null && (arxiVar = arxjVar.a) != null) {
            return arxiVar;
        }
        return obj;
    }
}
