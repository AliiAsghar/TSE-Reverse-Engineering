package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qyg {
    public static final alwo a = alwo.o("BugleImage");
    private final Context b;
    private final uga c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final vl g = new vl();
    private final Object h = new Object();

    public qyg(Context context, uga ugaVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.b = context;
        this.c = ugaVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
    }

    public final void a(String str) {
        synchronized (this.h) {
            rrb rrbVar = (rrb) this.g.remove(str);
            if (rrbVar != null) {
                xyl.k(rrbVar.g());
                rrbVar.f();
            }
        }
    }

    public final void b(String str, ParticipantsTable.BindData bindData) {
        xyl.l(bindData);
        xyl.l(str);
        Uri v = bindData.v();
        if (v != null && !TextUtils.isEmpty(v.toString())) {
            akrh e = aktp.e("ProfilePhotoBasedParticipantColorUpdater.updateParticipantColorBasedOnProfilePhoto");
            try {
                qyf qyfVar = new qyf(this, str, this.d, this.e, this.f);
                int dimension = (int) this.b.getResources().getDimension(R.dimen.min_touch_target_size);
                rra e2 = new ugi(v, dimension, dimension, false, false, 0).e(this.b, qyfVar);
                a(str);
                rrb rrbVar = new rrb();
                rrbVar.c(e2);
                synchronized (this.h) {
                    this.g.put(str, rrbVar);
                }
                this.c.b(e2);
                e.close();
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
