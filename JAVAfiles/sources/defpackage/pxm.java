package defpackage;

import j$.util.Optional;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class pxm implements pxo {
    private final adje a;
    private int b = 0;
    private Optional c = Optional.empty();
    private final hgj d;

    public pxm(adje adjeVar, hgj hgjVar) {
        this.a = adjeVar;
        this.d = hgjVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x010c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017e A[Catch: pxs -> 0x032f, TryCatch #0 {pxs -> 0x032f, blocks: (B:19:0x0022, B:20:0x0096, B:22:0x009c, B:25:0x00b2, B:31:0x010f, B:32:0x015c, B:33:0x0175, B:35:0x017e, B:37:0x018a, B:71:0x019a, B:73:0x019e, B:75:0x01a2, B:78:0x01a8, B:80:0x01cd, B:82:0x01d5, B:84:0x01dd, B:86:0x01e5, B:88:0x0201, B:90:0x0209, B:92:0x020f, B:93:0x0233, B:95:0x0245, B:96:0x0262, B:98:0x02a5, B:99:0x02b1, B:100:0x025a, B:102:0x02c8, B:103:0x02cf, B:104:0x02d0, B:105:0x02e6, B:106:0x02e7, B:107:0x02ee, B:108:0x02ef, B:109:0x02f6, B:110:0x02f7, B:111:0x02fe, B:112:0x02ff, B:114:0x0308, B:115:0x030d, B:117:0x0311, B:118:0x0316, B:120:0x031a, B:121:0x031f, B:122:0x032e), top: B:18:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0193 A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // defpackage.pxo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.akul a() {
        /*
            Method dump skipped, instructions count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxm.a():akul");
    }

    @Override // defpackage.pxo
    public final boolean b(UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (this.b == 1) {
            this.c = Optional.of(urlResponseInfo);
        }
        if (this.b < 2) {
            if (httpStatusCode == 401) {
                return true;
            }
            return false;
        }
        if (httpStatusCode != 200) {
            return true;
        }
        return false;
    }
}
