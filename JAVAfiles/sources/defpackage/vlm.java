package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum vlm implements apak {
    NT_UNKNOWN(0),
    NT_TEST(1),
    NT_INCOMING_MESSAGE(2),
    NT_DIRECTOR(3),
    NT_SHARE_PDU(4),
    NT_SECONDARY_USER(5),
    NT_INCOMING_UNAPPROVED_MESSAGE(6),
    NT_SUMMARY(7);

    public final int i;

    vlm(int i) {
        this.i = i;
    }

    public static vlm b(int i) {
        switch (i) {
            case 0:
                return NT_UNKNOWN;
            case 1:
                return NT_TEST;
            case 2:
                return NT_INCOMING_MESSAGE;
            case 3:
                return NT_DIRECTOR;
            case 4:
                return NT_SHARE_PDU;
            case 5:
                return NT_SECONDARY_USER;
            case 6:
                return NT_INCOMING_UNAPPROVED_MESSAGE;
            case 7:
                return NT_SUMMARY;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
