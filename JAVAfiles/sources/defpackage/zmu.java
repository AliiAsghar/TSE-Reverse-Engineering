package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmu extends zhz {
    public final zmt g;
    private final aksr h;
    private final mbl i;
    private final int j;
    private zmp[] k;

    public zmu(Context context, zmt zmtVar, aksr aksrVar, mbl mblVar, int i, String str) {
        super(context);
        this.g = zmtVar;
        this.h = aksrVar;
        this.i = mblVar;
        this.j = i;
        this.b = str;
    }

    public static CharSequence e(Context context, zmp zmpVar) {
        int ordinal = zmpVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return context.getString(R.string.action_mark_as_read_or_unread);
                    }
                    throw new UnsupportedOperationException("Unsupported Swipe action value");
                }
                return context.getString(R.string.action_delete);
            }
            return context.getString(R.string.action_archive);
        }
        return context.getString(R.string.action_off);
    }

    public final zmp a() {
        return this.k[this.d];
    }

    @Override // defpackage.zhz
    public final void b(int i) {
        akrc b = this.h.b("saveSwipeSetting");
        try {
            zmp a = a();
            this.d = i;
            zmp a2 = a();
            if (a != a2) {
                this.i.e("Bugle.Settings.Swipe.Update.Count", a2.e);
            }
            if (this.j == R.string.swipe_left_key) {
                zmt zmtVar = this.g;
                akul.g(((aiwu) zmtVar.e.b()).b(new zet(a2, 7), andi.a)).h(new zet(zmtVar, 8), andi.a).k(qiu.b(), andi.a);
            } else {
                zmt zmtVar2 = this.g;
                akul.g(((aiwu) zmtVar2.e.b()).b(new zet(a2, 5), andi.a)).h(new zet(zmtVar2, 6), andi.a).k(qiu.b(), andi.a);
            }
            d();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.zhz
    public final void c() {
        zmp[] d = zmt.d();
        this.k = d;
        int length = d.length;
        CharSequence[] charSequenceArr = new CharSequence[4];
        int i = 0;
        while (true) {
            int length2 = d.length;
            if (i < 4) {
                charSequenceArr[i] = e(this.a, d[i]);
                i++;
            } else {
                this.c = charSequenceArr;
                this.b = this.b;
                super.c();
                return;
            }
        }
    }
}
