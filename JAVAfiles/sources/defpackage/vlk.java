package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vlk {
    public static final uuf a = uuh.e(uuh.b, "max_lines_in_inbox_style_notification", 5);
    public static final alwo b = alwo.o("BugleNotifications");
    public final Context c;
    public final aneo d;
    public final anen e;
    public final aquq f;
    public final vco g;

    public vlk(Context context, aquq aquqVar, aneo aneoVar, anen anenVar, vco vcoVar) {
        this.c = context;
        this.f = aquqVar;
        this.d = aneoVar;
        this.e = anenVar;
        this.g = vcoVar;
    }

    public final akul a(String str, Uri uri, Uri uri2) {
        dzu dzuVar = new dzu();
        dzuVar.a = str;
        if (uri2 != null) {
            dzuVar.c = uri2.toString();
        }
        aktp.ag(null);
        Resources resources = this.c.getResources();
        return akul.g(hld.a(((hlp) this.f.d().z()).p(new hxc().L((int) resources.getDimension(R.dimen.notification_large_icon_width), (int) resources.getDimension(R.dimen.notification_large_icon_height))).h(uri))).h(new vgd(dzuVar, 5), this.d);
    }
}
