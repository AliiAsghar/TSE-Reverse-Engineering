package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahxn {
    public static final ahxn a;
    private static final /* synthetic */ ahxn[] b;

    static {
        ahxn ahxnVar = new ahxn();
        a = ahxnVar;
        b = new ahxn[]{ahxnVar};
    }

    private ahxn() {
    }

    public static ahxn valueOf(String str) {
        return (ahxn) Enum.valueOf(ahxn.class, str);
    }

    public static ahxn[] values() {
        return (ahxn[]) b.clone();
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        if (ordinal() != 0) {
            return super.toString();
        }
        return "routing_summaries";
    }
}
