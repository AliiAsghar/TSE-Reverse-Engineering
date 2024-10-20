package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import j$.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eve extends evb {
    private evl a;
    private byte[] b;
    private int c;
    private int d;

    public eve() {
        super(false);
    }

    @Override // defpackage.eqe
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.b;
        int i4 = eul.a;
        System.arraycopy(bArr2, this.c, bArr, i, min);
        this.c += min;
        this.d -= min;
        g(min);
        return min;
    }

    @Override // defpackage.evg
    public final long b(evl evlVar) {
        j();
        this.a = evlVar;
        Uri normalizeScheme = evlVar.a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        d.t(GroupManagementRequest.DATA_TAG.equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] ae = eul.ae(normalizeScheme.getSchemeSpecificPart(), ",");
        if (ae.length == 2) {
            String str = ae[1];
            if (ae[0].contains(";base64")) {
                try {
                    this.b = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw new erm("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e, true, 0);
                }
            } else {
                this.b = eul.ac(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
            }
            long j = evlVar.e;
            int length = this.b.length;
            if (j <= length) {
                int i = (int) j;
                this.c = i;
                this.d = length - i;
                long j2 = evlVar.f;
                i(evlVar);
                long j3 = evlVar.f;
                return this.d;
            }
            this.b = null;
            throw new evi(2008);
        }
        throw new erm("Unexpected URI format: ".concat(String.valueOf(String.valueOf(normalizeScheme))), null, true, 0);
    }

    @Override // defpackage.evg
    public final Uri c() {
        evl evlVar = this.a;
        if (evlVar != null) {
            return evlVar.a;
        }
        return null;
    }

    @Override // defpackage.evg
    public final void d() {
        if (this.b != null) {
            this.b = null;
            h();
        }
        this.a = null;
    }
}
