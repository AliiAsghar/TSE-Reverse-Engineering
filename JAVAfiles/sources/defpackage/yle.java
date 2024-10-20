package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yle {
    private static final xze a = xze.g("BugleRcs", "MessageLogDecorator");

    public static amgu a(byte[] bArr) {
        try {
        } catch (apba e) {
            a.r("Failed to parse the log data from additional message details.", e);
        }
        if (bArr != null) {
            return (amgu) apag.parseFrom(amgu.a, bArr, aozs.a());
        }
        a.q("Could not find log data in additional message details.");
        return amgu.a;
    }
}
