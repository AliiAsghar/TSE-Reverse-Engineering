package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxr implements zxq {
    private final Context d;
    private final armf e;
    private final armf f;
    private final HashSet c = new HashSet();
    private float g = ((Float) zxq.b.e()).floatValue();
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;

    public zxr(Context context, armf armfVar, armf armfVar2) {
        this.d = context;
        this.e = armfVar;
        this.f = armfVar2;
    }

    @Override // defpackage.zxq
    public final float a() {
        return this.g;
    }

    @Override // defpackage.zxq
    public final void b(zxp zxpVar) {
        aiut.g();
        this.c.add(zxpVar);
    }

    @Override // defpackage.zxq
    public final void c(float f) {
        aiut.g();
        this.h = true;
        if (f != this.g) {
            this.g = f;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((zxp) it.next()).fT();
            }
        }
    }

    @Override // defpackage.emx
    public final void f(enm enmVar) {
        if (((Optional) this.e.b()).isPresent() && this.i) {
            zxm zxmVar = (zxm) ((Optional) this.e.b()).get();
            final float f = this.g;
            zxmVar.a().j(new algk() { // from class: zxl
                @Override // defpackage.algk
                public final Object apply(Object obj) {
                    zxk zxkVar = (zxk) obj;
                    zxkVar.getClass();
                    aozy builder = zxkVar.toBuilder();
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    float f2 = f;
                    zxk zxkVar2 = (zxk) builder.b;
                    zxkVar2.b |= 1;
                    zxkVar2.c = f2;
                    return (zxk) builder.s();
                }
            }).k(qiu.c(new zrg(zxmVar, 13)), zxmVar.d);
            float f2 = this.g;
            if (f2 == 1.0f) {
                ((mbl) this.f.b()).e("Bugle.ConversationScale.ConversationScaleSaved.Count", 1);
                return;
            }
            if (f2 > 1.0f && f2 <= 1.1f) {
                ((mbl) this.f.b()).e("Bugle.ConversationScale.ConversationScaleSaved.Count", 2);
                return;
            }
            if (f2 > 1.1f && f2 <= 1.2f) {
                ((mbl) this.f.b()).e("Bugle.ConversationScale.ConversationScaleSaved.Count", 3);
                return;
            }
            if (f2 > 1.2f && f2 <= 1.3f) {
                ((mbl) this.f.b()).e("Bugle.ConversationScale.ConversationScaleSaved.Count", 4);
                return;
            }
            if (f2 > 1.3f && f2 <= 1.4f) {
                ((mbl) this.f.b()).e("Bugle.ConversationScale.ConversationScaleSaved.Count", 5);
                return;
            }
            if (f2 > 1.4f && f2 <= 1.5f) {
                ((mbl) this.f.b()).e("Bugle.ConversationScale.ConversationScaleSaved.Count", 6);
                return;
            }
            if (f2 > 1.5f && f2 <= 1.6f) {
                ((mbl) this.f.b()).e("Bugle.ConversationScale.ConversationScaleSaved.Count", 7);
            } else if (f2 > 1.6f) {
                ((mbl) this.f.b()).e("Bugle.ConversationScale.ConversationScaleSaved.Count", 8);
            }
        }
    }

    @Override // defpackage.zxq
    public final void j(float f) {
        boolean z;
        aiut.g();
        if (this.h && f != brg.a) {
            float f2 = this.g + f;
            float floatValue = ((Float) zxq.b.e()).floatValue();
            float floatValue2 = ((Float) zxq.a.e()).floatValue();
            if (floatValue2 >= floatValue) {
                z = true;
            } else {
                z = false;
            }
            d.s(z);
            if (f2 > floatValue2) {
                f2 = floatValue2;
            } else if (f2 < floatValue) {
                f2 = floatValue;
            }
            if (this.g != f2) {
                this.i = true;
                this.g = f2;
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((zxp) it.next()).fT();
                }
                if (!this.j) {
                    Toast.makeText(this.d, R.string.conversation_scale_toast_text, 0).show();
                    this.j = true;
                }
            }
        }
    }

    @Override // defpackage.zxq
    public final void k(zxp zxpVar) {
        aiut.g();
        this.c.remove(zxpVar);
    }

    @Override // defpackage.emx
    public final /* synthetic */ void d(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gF(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void h(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void i(enm enmVar) {
    }
}
