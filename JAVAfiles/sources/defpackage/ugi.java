package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ugi extends ufs {
    public final Uri k;
    public final boolean l;
    public final Throwable m;

    public ugi(Uri uri, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, int i5) {
        this(uri, i, i2, i3, i4, z, z2, z3, i5, false);
    }

    public Uri a() {
        return this.k;
    }

    public ufw d(Context context, int i) {
        ufr ughVar;
        Uri a = a();
        if (a != null && !ydk.w(a)) {
            ughVar = new ugd(context, this);
        } else {
            ughVar = new ugh(context, this);
        }
        ughVar.f = i;
        return ughVar;
    }

    @Override // defpackage.ufs, defpackage.ufx
    public ufw f(Context context) {
        return d(context, 0);
    }

    @Override // defpackage.ufs
    public String g() {
        Uri a = a();
        if (a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append('|');
            sb.append(this.c);
            sb.append('|');
            sb.append(this.h);
            sb.append('|');
            sb.append(this.i);
            sb.append('|');
            sb.append(this.g);
            sb.append('|');
            sb.append(this.j);
            return a + '|' + this.l + '|' + sb.toString();
        }
        return null;
    }

    public ugi(Uri uri, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, int i5, boolean z4) {
        super(i, i2, ImageView.ScaleType.CENTER_CROP, i3, i4, z2, z3, i5, z4);
        this.k = uri;
        this.l = z;
        if (!xyp.c()) {
            this.m = null;
            return;
        }
        this.m = new Throwable("src:" + i3 + "x" + i4 + " des:" + i + "x" + i2 + " of " + g());
    }

    public ugi(Uri uri, int i, int i2, boolean z, boolean z2, int i3) {
        this(uri, i, i2, -1, -1, false, z, z2, i3);
    }
}
