package defpackage;

import io.grpc.Status;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqvy implements aqus {
    @Override // defpackage.aqus
    public final /* synthetic */ Object a(byte[] bArr) {
        int i;
        int i2;
        byte b;
        List list = Status.a;
        int length = bArr.length;
        char c = 0;
        if (length == 1) {
            if (bArr[0] == 48) {
                return Status.b;
            }
            length = 1;
        }
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = (b - 48) * 10;
                c = 1;
            }
            return Status.d.withDescription("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
        }
        i = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57 && (i2 = i + (b2 - 48)) < Status.a.size()) {
            return (Status) Status.a.get(i2);
        }
        return Status.d.withDescription("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
    }

    @Override // defpackage.aqus
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        return ((Status) obj).getCode().r;
    }
}
