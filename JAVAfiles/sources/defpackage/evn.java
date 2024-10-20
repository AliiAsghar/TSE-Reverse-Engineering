package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evn implements evg {
    private final Context a;
    private final List b = new ArrayList();
    private final evg c;
    private evg d;
    private evg e;
    private evg f;
    private evg g;
    private evg h;
    private evg i;
    private evg j;
    private evg k;

    public evn(Context context, evg evgVar) {
        this.a = context.getApplicationContext();
        this.c = evgVar;
    }

    private final evg g() {
        if (this.e == null) {
            eva evaVar = new eva(this.a);
            this.e = evaVar;
            h(evaVar);
        }
        return this.e;
    }

    private final void h(evg evgVar) {
        for (int i = 0; i < this.b.size(); i++) {
            evgVar.f((ewc) this.b.get(i));
        }
    }

    private static final void i(evg evgVar, ewc ewcVar) {
        if (evgVar != null) {
            evgVar.f(ewcVar);
        }
    }

    @Override // defpackage.eqe
    public final int a(byte[] bArr, int i, int i2) {
        evg evgVar = this.k;
        dzg.g(evgVar);
        return evgVar.a(bArr, i, i2);
    }

    @Override // defpackage.evg
    public final long b(evl evlVar) {
        boolean z;
        evg evgVar;
        if (this.k == null) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        String scheme = evlVar.a.getScheme();
        Uri uri = evlVar.a;
        int i = eul.a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            if ("asset".equals(scheme)) {
                this.k = g();
            } else if ("content".equals(scheme)) {
                if (this.f == null) {
                    evd evdVar = new evd(this.a);
                    this.f = evdVar;
                    h(evdVar);
                }
                this.k = this.f;
            } else if ("rtmp".equals(scheme)) {
                if (this.g == null) {
                    try {
                        evg evgVar2 = (evg) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = evgVar2;
                        h(evgVar2);
                    } catch (ClassNotFoundException unused) {
                        eub.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.g == null) {
                        this.g = this.c;
                    }
                }
                this.k = this.g;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    ewe eweVar = new ewe();
                    this.h = eweVar;
                    h(eweVar);
                }
                this.k = this.h;
            } else if (GroupManagementRequest.DATA_TAG.equals(scheme)) {
                if (this.i == null) {
                    eve eveVar = new eve();
                    this.i = eveVar;
                    h(eveVar);
                }
                this.k = this.i;
            } else {
                if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    evgVar = this.c;
                } else {
                    if (this.j == null) {
                        ewa ewaVar = new ewa(this.a);
                        this.j = ewaVar;
                        h(ewaVar);
                    }
                    evgVar = this.j;
                }
                this.k = evgVar;
            }
        } else {
            String path = evlVar.a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.k = g();
            } else {
                if (this.d == null) {
                    evt evtVar = new evt();
                    this.d = evtVar;
                    h(evtVar);
                }
                this.k = this.d;
            }
        }
        return this.k.b(evlVar);
    }

    @Override // defpackage.evg
    public final Uri c() {
        evg evgVar = this.k;
        if (evgVar == null) {
            return null;
        }
        return evgVar.c();
    }

    @Override // defpackage.evg
    public final void d() {
        evg evgVar = this.k;
        if (evgVar != null) {
            try {
                evgVar.d();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // defpackage.evg
    public final Map e() {
        evg evgVar = this.k;
        if (evgVar == null) {
            return Collections.emptyMap();
        }
        return evgVar.e();
    }

    @Override // defpackage.evg
    public final void f(ewc ewcVar) {
        dzg.g(ewcVar);
        this.c.f(ewcVar);
        this.b.add(ewcVar);
        i(this.d, ewcVar);
        i(this.e, ewcVar);
        i(this.f, ewcVar);
        i(this.g, ewcVar);
        i(this.h, ewcVar);
        i(this.i, ewcVar);
        i(this.j, ewcVar);
    }
}
