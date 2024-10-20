package defpackage;

import android.text.TextUtils;
import android.widget.EditText;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ioj implements aapu {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ioj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    private final void l() {
        if (!((iog) this.a).e.m()) {
            iog iogVar = (iog) this.a;
            cj fe = iogVar.d.fe();
            if (fe == null || !yhx.d(fe, iogVar.n.a)) {
                return;
            }
        }
        ((iog) this.a).i.h(false);
    }

    private final void m(MessagePartCoreData messagePartCoreData) {
        if (messagePartCoreData instanceof PendingAttachmentData) {
            zri zriVar = ((zrb) ((aabk) this.a).o).c;
            ((rsr) zriVar.y.a()).D((PendingAttachmentData) messagePartCoreData, zriVar.y);
            zriVar.n.requestFocus();
            zriVar.m();
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(messagePartCoreData);
            zri zriVar2 = ((zrb) ((aabk) this.a).o).c;
            if (((rsr) zriVar2.y.a()).S(arrayList, zriVar2.y.b())) {
                zriVar2.n(true);
            }
            ((gpx) zriVar2.ai.b()).x();
        }
        if (!((aabk) this.a).h.m() && !((aabk) this.a).n.aX()) {
            return;
        }
        ((aabk) this.a).o.C(false);
    }

    @Override // defpackage.aapu
    public final /* synthetic */ void a(imv imvVar, aauj aaujVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                aajv.g(this, imvVar, aaujVar);
                return;
            } else {
                aajv.g(this, imvVar, aaujVar);
                return;
            }
        }
        aajv.g(this, imvVar, aaujVar);
    }

    @Override // defpackage.aapu
    public final /* synthetic */ void b(MediaContentItem mediaContentItem, aauj aaujVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                aajv.h(this, mediaContentItem, aaujVar);
                return;
            } else {
                aajv.h(this, mediaContentItem, aaujVar);
                return;
            }
        }
        aajv.h(this, mediaContentItem, aaujVar);
    }

    @Override // defpackage.aapu
    public final void c(imv imvVar, aauj aaujVar, int i) {
        amoq amoqVar;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                aabk aabkVar = (aabk) this.a;
                MessagePartCoreData u = aabkVar.o.u(aabkVar.j.d(imvVar, aaujVar));
                if (u != null) {
                    amoqVar = u.N();
                } else {
                    amoqVar = null;
                }
                if (amoqVar != null) {
                    ((aabk) this.a).p(amoqVar, i);
                    return;
                }
                ((aabk) this.a).p(aajv.e(imvVar, aaujVar), i);
                return;
            }
            iog iogVar = (iog) this.a;
            if (iogVar.j.h(iogVar.p.d(imvVar, aaujVar))) {
                Object obj = this.a;
                ((iog) obj).a.d(aajv.e(imvVar, aaujVar), i);
                return;
            }
            return;
        }
        iol iolVar = (iol) this.a;
        if (iolVar.f.h(iolVar.i.d(imvVar, aaujVar))) {
            Object obj2 = this.a;
            ((iol) obj2).a.d(aajv.e(imvVar, aaujVar), i);
        }
    }

    @Override // defpackage.aapu
    public final void d(MediaContentItem mediaContentItem, aauj aaujVar, int i) {
        amoq amoqVar;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                aabk aabkVar = (aabk) this.a;
                MessagePartCoreData u = aabkVar.o.u(aabkVar.k.e(mediaContentItem, aaujVar));
                if (u != null) {
                    amoqVar = u.N();
                } else {
                    amoqVar = null;
                }
                if (amoqVar != null) {
                    ((aabk) this.a).p(amoqVar, i);
                    return;
                }
                ((aabk) this.a).p(aajv.s(mediaContentItem, aaujVar), i);
                return;
            }
            iog iogVar = (iog) this.a;
            if (iogVar.j.h(iogVar.q.e(mediaContentItem, aaujVar))) {
                Object obj = this.a;
                ((iog) obj).a.d(aajv.s(mediaContentItem, aaujVar), i);
                return;
            }
            return;
        }
        iol iolVar = (iol) this.a;
        if (iolVar.f.h(iolVar.j.e(mediaContentItem, aaujVar))) {
            Object obj2 = this.a;
            ((iol) obj2).a.d(aajv.s(mediaContentItem, aaujVar), i);
        }
    }

    @Override // defpackage.aapu
    public final /* synthetic */ void e(imv imvVar, aauj aaujVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                aajv.i(this, imvVar, aaujVar);
                return;
            } else {
                aajv.i(this, imvVar, aaujVar);
                return;
            }
        }
        aajv.i(this, imvVar, aaujVar);
    }

    @Override // defpackage.aapu
    public final void f(imv imvVar, aauj aaujVar, int i) {
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                m(((aabk) this.a).j.d(imvVar, aaujVar));
                ((aabk) this.a).d.c(aajv.e(imvVar, aaujVar), ((rsr) ((aabk) this.a).i.a()).k() - 1, i);
                return;
            }
            iog iogVar = (iog) this.a;
            ((iog) this.a).a.c(aajv.e(imvVar, aaujVar), iogVar.j.c(iogVar.p.d(imvVar, aaujVar)), i);
            l();
            return;
        }
        iol iolVar = (iol) this.a;
        ((iol) this.a).a.c(aajv.e(imvVar, aaujVar), iolVar.f.c(iolVar.i.d(imvVar, aaujVar)), i);
    }

    @Override // defpackage.aapu
    public final /* synthetic */ void g(MediaContentItem mediaContentItem, aauj aaujVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                aajv.j(this, mediaContentItem, aaujVar);
                return;
            } else {
                aajv.j(this, mediaContentItem, aaujVar);
                return;
            }
        }
        aajv.j(this, mediaContentItem, aaujVar);
    }

    @Override // defpackage.aapu
    public final void h(MediaContentItem mediaContentItem, aauj aaujVar, int i) {
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                m(((aabk) this.a).k.e(mediaContentItem, aaujVar));
                ((aabk) this.a).d.c(aajv.s(mediaContentItem, aaujVar), ((rsr) ((aabk) this.a).i.a()).k() - 1, i);
                return;
            }
            iog iogVar = (iog) this.a;
            ((iog) this.a).a.c(aajv.s(mediaContentItem, aaujVar), iogVar.j.c(iogVar.q.e(mediaContentItem, aaujVar)), i);
            l();
            return;
        }
        iol iolVar = (iol) this.a;
        ((iol) this.a).a.c(aajv.s(mediaContentItem, aaujVar), iolVar.f.c(iolVar.j.e(mediaContentItem, aaujVar)), i);
    }

    @Override // defpackage.aapu
    public final /* synthetic */ void i(myr myrVar, aauj aaujVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                aajv.k(this, myrVar, aaujVar);
                return;
            } else {
                aajv.k(this, myrVar, aaujVar);
                return;
            }
        }
        aajv.k(this, myrVar, aaujVar);
    }

    @Override // defpackage.aapu
    public final void j(myr myrVar, aauj aaujVar, int i) {
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                String b = myrVar.b();
                if (TextUtils.isEmpty(b)) {
                    return;
                }
                ((aabk) this.a).q.h(b);
                Object obj = this.a;
                ((aabk) obj).d.c(aajv.q(myrVar, aaujVar), -1, i);
                return;
            }
            String b2 = myrVar.b();
            if (TextUtils.isEmpty(b2)) {
                return;
            }
            EditText d = ((iog) this.a).j.d();
            if (d != null) {
                int selectionStart = d.getSelectionStart();
                int selectionEnd = d.getSelectionEnd();
                d.getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), b2);
            }
            Object obj2 = this.a;
            ((iog) obj2).a.c(aajv.q(myrVar, aaujVar), -1, i);
        }
    }

    @Override // defpackage.aapu
    public final void k(aaqn aaqnVar) {
        EditText d;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                String str = ((aarg) aaqnVar).a;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                ((aabk) this.a).q.h(str);
                ((aabk) this.a).e.aY();
                return;
            }
            String str2 = ((aarg) aaqnVar).a;
            if (!TextUtils.isEmpty(str2) && (d = ((iog) this.a).j.d()) != null) {
                int selectionStart = d.getSelectionStart();
                int selectionEnd = d.getSelectionEnd();
                d.getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), str2);
            }
        }
    }
}
