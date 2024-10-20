package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import j$.util.OptionalInt;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ufc extends ugh implements xvb {
    private static final alwo g = alwo.o("BugleImage");
    private final xvc h;

    public ufc(Context context, xvc xvcVar, ufd ufdVar) {
        super(context, ufdVar);
        this.h = xvcVar;
    }

    @Override // defpackage.xvb
    public final Bitmap a(int i, int i2, int i3) {
        return i().b(i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ugh, defpackage.ufr
    public ufu b(List list) {
        boolean z;
        Bitmap bitmap;
        Bitmap y;
        akrh e = aktp.e("AvatarRequest.loadMediaInternal");
        try {
            aiut.b();
            Uri uri = ((ufd) this.b).k;
            String j = xvc.j(uri);
            int i = 1;
            if (!ydk.v(uri) && !"r".equals(j)) {
                z = false;
            } else {
                z = true;
            }
            Bitmap bitmap2 = null;
            if (z) {
                try {
                    ufu b = super.b(list);
                    bitmap2 = b.d();
                    i = b.d;
                } catch (Exception e2) {
                    ((alwl) ((alwl) ((alwl) g.i()).g(e2)).h("com/google/android/apps/messaging/shared/datamodel/media/avatar/AvatarRequest", "loadMediaInternal", 'n', "AvatarRequest.java")).q("failed to load local avatar resource, switching to fallback rendering.");
                }
            }
            int i2 = i;
            ufd ufdVar = (ufd) this.b;
            int i3 = ufdVar.b;
            int i4 = ufdVar.c;
            if (bitmap2 == null) {
                if (z && (uri = xvc.d(uri)) == null) {
                    uri = xvc.c(this.a);
                }
                Integer h = xvc.h(uri);
                String k = xvc.k(uri);
                String j2 = xvc.j(uri);
                if ("l".equals(j2)) {
                    y = this.h.z(xvc.m(uri), k, i3, i4, h, this, false, OptionalInt.empty());
                } else if ("z".equals(j2)) {
                    xvc xvcVar = this.h;
                    y = xvcVar.y(k, i3, i4, true, false, h, this, false, false, false);
                } else if ("p".equals(j2)) {
                    xvc xvcVar2 = this.h;
                    y = xvcVar2.y(k, i3, i4, false, false, h, this, true, false, false);
                } else if ("o".equals(j2)) {
                    xvc xvcVar3 = this.h;
                    y = xvcVar3.y(k, i3, i4, false, false, h, this, false, true, false);
                } else if ("sm".equals(j2)) {
                    xvc xvcVar4 = this.h;
                    y = xvcVar4.y(k, i3, i4, false, false, h, this, false, false, true);
                } else {
                    boolean equals = "b".equals(j2);
                    xvc xvcVar5 = this.h;
                    y = xvcVar5.y(k, i3, i4, false, equals, h, this, false, false, false);
                }
                bitmap = y;
            } else {
                bitmap = bitmap2;
            }
            ufh ufhVar = new ufh(m(), bitmap, i2, this.c, this.d);
            e.close();
            return ufhVar;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ugh, defpackage.ufr
    public final InputStream e() {
        Uri uri = ((ufd) this.b).k;
        if (uri != null) {
            if (ydk.v(uri)) {
                return super.e();
            }
            Uri e = xvc.e(uri);
            if (e != null) {
                xyl.k(ydk.v(e));
                try {
                    this.a.getContentResolver().takePersistableUriPermission(e, 3);
                } catch (SecurityException unused) {
                    alvw m = g.m();
                    m.X(ugl.h, e);
                    ((alwl) m.h("com/google/android/apps/messaging/shared/datamodel/media/avatar/AvatarRequest", "getInputStreamForResource", 76, "AvatarRequest.java")).q("Failed to grant persistable URI permissions.");
                }
                return this.a.getContentResolver().openInputStream(e);
            }
            return null;
        }
        return null;
    }
}
