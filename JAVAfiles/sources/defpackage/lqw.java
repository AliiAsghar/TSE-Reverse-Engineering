package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lqw implements algk {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ lqw(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                byte[] bArr = (byte[]) obj;
                alwo alwoVar = ydq.a;
                int length = bArr.length;
                int i2 = this.a;
                if (length == 0) {
                    ((alwl) ((alwl) ydq.a.i()).h("com/google/android/apps/messaging/shared/util/flogger/FloggerUtil", "getFloggerLogData", 60, "FloggerUtil.java")).q("No flogger disk logs found.");
                    return bArr;
                }
                try {
                    byte[] t = xzb.t(bArr, i2);
                    alwl alwlVar = (alwl) ydq.a.g();
                    alwlVar.X(ydo.a, Integer.valueOf(t.length));
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/util/flogger/FloggerUtil", "getFloggerLogData", 70, "FloggerUtil.java")).q("Returning flogger disk logs.");
                    return t;
                } catch (IOException e) {
                    ((alwl) ((alwl) ((alwl) ydq.a.i()).g(e)).h("com/google/android/apps/messaging/shared/util/flogger/FloggerUtil", "getFloggerLogData", 'I', "FloggerUtil.java")).q("Exception truncating flogger log data");
                    return new byte[0];
                }
            }
            return Integer.valueOf(this.a);
        }
        utz utzVar = lqx.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i3 = this.a;
        if (true != booleanValue) {
            i3 = -1;
        }
        return Integer.valueOf(i3);
    }
}
