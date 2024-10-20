package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hlp extends hwu implements Cloneable {
    private Object A;
    private List B;
    private hlp C;
    private hlp D;
    private Float E;
    private boolean F = true;
    private boolean G;
    private boolean H;
    public final hls a;
    private final Context w;
    private final Class x;
    private final hlf y;
    private hlt z;

    static {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public hlp(hkz hkzVar, hls hlsVar, Class cls, Context context) {
        this.a = hlsVar;
        this.x = cls;
        this.w = context;
        hlf hlfVar = hlsVar.b.c;
        hlt hltVar = (hlt) hlfVar.c.get(cls);
        if (hltVar == null) {
            for (Map.Entry entry : hlfVar.c.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    hltVar = (hlt) entry.getValue();
                }
            }
        }
        this.z = hltVar == null ? hlf.a : hltVar;
        this.y = hkzVar.c;
        Iterator it = hlsVar.e.iterator();
        while (it.hasNext()) {
            a((hxb) it.next());
        }
        p(hlsVar.h());
    }

    private final hlp ae(hlp hlpVar) {
        PackageInfo packageInfo;
        String uuid;
        hlp hlpVar2 = (hlp) hlpVar.Q(this.w.getTheme());
        int i = hyb.b;
        ConcurrentMap concurrentMap = hyc.a;
        Context context = this.w;
        String packageName = context.getPackageName();
        hne hneVar = (hne) hyc.a.get(packageName);
        if (hneVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for".concat(String.valueOf(context.getPackageName())), e);
                packageInfo = null;
            }
            if (packageInfo != null) {
                uuid = String.valueOf(packageInfo.versionCode);
            } else {
                uuid = UUID.randomUUID().toString();
            }
            hyf hyfVar = new hyf(uuid);
            hneVar = (hne) hyc.a.putIfAbsent(packageName, hyfVar);
            if (hneVar == null) {
                hneVar = hyfVar;
            }
        }
        return (hlp) hlpVar2.P(new hyb(context.getResources().getConfiguration().uiMode & 48, hneVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final hwx af(Object obj, hxq hxqVar, hxb hxbVar, hwz hwzVar, hlt hltVar, hlh hlhVar, int i, int i2, hwu hwuVar, Executor executor) {
        hwv hwvVar;
        hwz hwzVar2;
        hwx ag;
        int i3;
        int i4;
        hlt hltVar2;
        hlh hlhVar2;
        int i5;
        int i6;
        if (this.D != null) {
            hwzVar2 = new hwv(obj, hwzVar);
            hwvVar = hwzVar2;
        } else {
            hwvVar = 0;
            hwzVar2 = hwzVar;
        }
        hlp hlpVar = this.C;
        if (hlpVar != null) {
            if (!this.H) {
                hlt hltVar3 = hlpVar.z;
                if (true == hlpVar.F) {
                    hltVar2 = hltVar;
                } else {
                    hltVar2 = hltVar3;
                }
                if (super.V(8)) {
                    hlhVar2 = hlpVar.d;
                } else {
                    int i7 = hlo.b[hlhVar.ordinal()];
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3 && i7 != 4) {
                                throw new IllegalArgumentException("unknown priority: ".concat(String.valueOf(String.valueOf(this.d))));
                            }
                            hlhVar2 = hlh.IMMEDIATE;
                        } else {
                            hlhVar2 = hlh.HIGH;
                        }
                    } else {
                        hlhVar2 = hlh.NORMAL;
                    }
                }
                hlh hlhVar3 = hlhVar2;
                hlp hlpVar2 = this.C;
                int i8 = hlpVar2.k;
                int i9 = hlpVar2.j;
                if (hyv.n(i, i2) && !this.C.W()) {
                    i6 = hwuVar.k;
                    i5 = hwuVar.j;
                } else {
                    i5 = i9;
                    i6 = i8;
                }
                hxf hxfVar = new hxf(obj, hwzVar2);
                hwx ag2 = ag(obj, hxqVar, hxbVar, hwuVar, hxfVar, hltVar, hlhVar, i, i2, executor);
                this.H = true;
                hlp hlpVar3 = this.C;
                hwx af = hlpVar3.af(obj, hxqVar, hxbVar, hxfVar, hltVar2, hlhVar3, i6, i5, hlpVar3, executor);
                this.H = false;
                hxfVar.a = ag2;
                hxfVar.b = af;
                ag = hxfVar;
            } else {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
        } else {
            ag = ag(obj, hxqVar, hxbVar, hwuVar, hwzVar2, hltVar, hlhVar, i, i2, executor);
        }
        if (hwvVar == 0) {
            return ag;
        }
        hlp hlpVar4 = this.D;
        int i10 = hlpVar4.k;
        int i11 = hlpVar4.j;
        if (hyv.n(i, i2) && !this.D.W()) {
            i4 = hwuVar.k;
            i3 = hwuVar.j;
        } else {
            i3 = i11;
            i4 = i10;
        }
        hlp hlpVar5 = this.D;
        hwx af2 = hlpVar5.af(obj, hxqVar, hxbVar, hwvVar, hlpVar5.z, hlpVar5.d, i4, i3, hlpVar5, executor);
        hwvVar.a = ag;
        hwvVar.b = af2;
        return hwvVar;
    }

    private final hwx ag(Object obj, hxq hxqVar, hxb hxbVar, hwu hwuVar, hwz hwzVar, hlt hltVar, hlh hlhVar, int i, int i2, Executor executor) {
        Object obj2 = this.A;
        List list = this.B;
        hya hyaVar = hltVar.a;
        Context context = this.w;
        Class cls = this.x;
        hlf hlfVar = this.y;
        return new hxe(context, hlfVar, obj, obj2, cls, hwuVar, i, i2, hlhVar, hxqVar, hxbVar, list, hwzVar, hlfVar.d, hyaVar, executor);
    }

    public hlp a(hxb hxbVar) {
        if (this.t) {
            return clone().a(hxbVar);
        }
        if (hxbVar != null) {
            if (this.B == null) {
                this.B = new ArrayList();
            }
            this.B.add(hxbVar);
        }
        ab();
        return this;
    }

    @Override // defpackage.hwu
    /* renamed from: b */
    public hlp p(hwu hwuVar) {
        hwr.i(hwuVar);
        return (hlp) super.p(hwuVar);
    }

    @Override // defpackage.hwu
    /* renamed from: c */
    public hlp clone() {
        hlp hlpVar = (hlp) super.clone();
        hlpVar.z = hlpVar.z.clone();
        List list = hlpVar.B;
        if (list != null) {
            hlpVar.B = new ArrayList(list);
        }
        hlp hlpVar2 = hlpVar.C;
        if (hlpVar2 != null) {
            hlpVar.C = hlpVar2.clone();
        }
        hlp hlpVar3 = hlpVar.D;
        if (hlpVar3 != null) {
            hlpVar.D = hlpVar3.clone();
        }
        return hlpVar;
    }

    public hlp d(hlp hlpVar) {
        if (this.t) {
            return clone().d(hlpVar);
        }
        this.D = hlpVar;
        ab();
        return this;
    }

    public hlp e(Object obj) {
        return d(clone().d(null).n(null).j(obj));
    }

    @Override // defpackage.hwu
    public final boolean equals(Object obj) {
        if (obj instanceof hlp) {
            hlp hlpVar = (hlp) obj;
            if (super.equals(hlpVar) && Objects.equals(this.x, hlpVar.x) && this.z.equals(hlpVar.z) && Objects.equals(this.A, hlpVar.A) && Objects.equals(this.B, hlpVar.B) && Objects.equals(this.C, hlpVar.C) && Objects.equals(this.D, hlpVar.D)) {
                Float f = hlpVar.E;
                if (Objects.equals(null, null) && this.F == hlpVar.F && this.G == hlpVar.G) {
                    return true;
                }
            }
        }
        return false;
    }

    public hlp f(hxb hxbVar) {
        if (this.t) {
            return clone().f(hxbVar);
        }
        this.B = null;
        return a(hxbVar);
    }

    public hlp g(Drawable drawable) {
        return m(drawable).p(hxc.d(hpb.a));
    }

    public hlp h(Uri uri) {
        hlp m = m(uri);
        if (uri != null && "android.resource".equals(uri.getScheme())) {
            return ae(m);
        }
        return m;
    }

    @Override // defpackage.hwu
    public final int hashCode() {
        return hyv.d(this.G ? 1 : 0, hyv.d(this.F ? 1 : 0, hyv.e(null, hyv.e(this.D, hyv.e(this.C, hyv.e(this.B, hyv.e(this.A, hyv.e(this.z, hyv.e(this.x, super.hashCode())))))))));
    }

    public hlp i(Integer num) {
        return ae(m(num));
    }

    public hlp j(Object obj) {
        return m(obj);
    }

    public hlp k(String str) {
        return m(str);
    }

    public hlp l(byte[] bArr) {
        hlp m = m(bArr);
        if (!super.V(4)) {
            m = m.p(hxc.d(hpb.a));
        }
        if (!super.V(256)) {
            if (hxc.a == null) {
                hxc.a = (hxc) ((hxc) new hxc().ac()).w();
            }
            return m.p(hxc.a);
        }
        return m;
    }

    public final hlp m(Object obj) {
        if (this.t) {
            return clone().m(obj);
        }
        this.A = obj;
        this.G = true;
        ab();
        return this;
    }

    public hlp n(hlp hlpVar) {
        if (this.t) {
            return clone().n(hlpVar);
        }
        this.C = hlpVar;
        ab();
        return this;
    }

    public hlp o(hlt hltVar) {
        if (this.t) {
            return clone().o(hltVar);
        }
        hwr.i(hltVar);
        this.z = hltVar;
        this.F = false;
        ab();
        return this;
    }

    public final hxa r() {
        return s(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final hxa s(int i, int i2) {
        hxa hxaVar = new hxa(i, i2);
        u(hxaVar, hxaVar, this, hyn.b);
        return hxaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(android.widget.ImageView r4) {
        /*
            r3 = this;
            defpackage.hyv.i()
            defpackage.hwr.i(r4)
            r0 = 2048(0x800, float:2.87E-42)
            boolean r0 = super.V(r0)
            if (r0 != 0) goto L4c
            boolean r0 = r3.n
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = defpackage.hlo.a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L43;
                case 2: goto L3a;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L4c
        L28:
            hwu r0 = r3.clone()
            hwu r0 = r0.I()
            goto L4d
        L31:
            hwu r0 = r3.clone()
            hwu r0 = r0.J()
            goto L4d
        L3a:
            hwu r0 = r3.clone()
            hwu r0 = r0.I()
            goto L4d
        L43:
            hwu r0 = r3.clone()
            hwu r0 = r0.H()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            hlf r1 = r3.y
            java.lang.Class r2 = r3.x
            hwr r1 = r1.g
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L61
            hxh r1 = new hxh
            r1.<init>(r4)
            goto L6e
        L61:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L75
            hxk r1 = new hxk
            r1.<init>(r4)
        L6e:
            r4 = 0
            java.util.concurrent.Executor r2 = defpackage.hyn.a
            r3.u(r1, r4, r0, r2)
            return
        L75:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unhandled class: "
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            java.lang.String r0 = defpackage.a.bX(r2, r0, r1)
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hlp.t(android.widget.ImageView):void");
    }

    public final void u(hxq hxqVar, hxb hxbVar, hwu hwuVar, Executor executor) {
        hwr.i(hxqVar);
        if (this.G) {
            hwx af = af(new Object(), hxqVar, hxbVar, null, this.z, hwuVar.d, hwuVar.k, hwuVar.j, hwuVar, executor);
            hwx c = hxqVar.c();
            if (af.m(c) && (hwuVar.i || !c.l())) {
                hwr.i(c);
                if (!c.n()) {
                    c.b();
                    return;
                }
                return;
            }
            this.a.j(hxqVar);
            hxqVar.h(af);
            this.a.q(hxqVar, af);
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final void v(hxq hxqVar) {
        u(hxqVar, null, this, hyn.a);
    }
}
