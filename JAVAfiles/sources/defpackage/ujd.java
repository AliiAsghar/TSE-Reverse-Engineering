package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConstants;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ujd {
    public static final xze a = xze.g("BugleDataModel", "HandlersToDownloadCallbackAdapter");
    public final Set b = new CopyOnWriteArraySet();
    private final anen c;
    private final anen d;

    public ujd(anen anenVar, anen anenVar2) {
        this.c = anenVar;
        this.d = anenVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Set set) {
        this.b.addAll(set);
    }

    public final void b(Uri uri, Throwable th) {
        xyo e = a.e();
        e.H("Download failed, notifying callbacks");
        e.z(VCardConstants.PROPERTY_URL, uri);
        e.r(th);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            c(new ryv((uji) it.next(), uri, 16, null));
        }
        this.b.clear();
    }

    public final void c(Runnable runnable) {
        aktp.aa(aktp.ah(runnable, this.c), new pum(5), this.d);
    }
}
