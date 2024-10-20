package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class uim {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingJob");
    public Uri b;
    public final Uri c;
    protected final long d;
    public String e;
    public final Context f;
    public tql g;
    private final anen h;

    public uim(Context context, uip uipVar, String str, anen anenVar) {
        this.f = context;
        this.c = Uri.parse(uipVar.c);
        this.d = uipVar.d;
        this.e = str;
        this.h = anenVar;
    }

    protected abstract akul a();

    public final akul b() {
        aiut.b();
        this.b = uhl.d(null, this.f);
        this.g = tql.FAILED;
        try {
            alvw g = a.g();
            g.X(alwp.a, "BugleResizing");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingJob", "run", 61, "ResizingJob.java")).K("Starting %s, contentUri: %s, outputUri: %s, maxFileSize: %d", getClass().getName(), this.c, this.b, Long.valueOf(this.d));
            return a().h(new uht(this, 16), this.h);
        } catch (Exception e) {
            alvw i = a.i();
            i.X(alwp.a, "BugleResizing");
            ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingJob", "run", 82, "ResizingJob.java")).t("Exception while transcoding contentUri: %s", this.c);
            if (e instanceof xys) {
                this.g = tql.TOO_LARGE;
            }
            uhl.j(this.f, this.b);
            return aktp.ag(false);
        }
    }

    public final int c() {
        int ordinal = this.g.ordinal();
        if (ordinal == 0) {
            return 3;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return 2;
                }
                return 6;
            }
            return 5;
        }
        return 4;
    }
}
