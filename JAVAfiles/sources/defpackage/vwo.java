package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vwo extends unp {
    public static final xze a = xze.g("BugleDataModel", "ProcessRcsGroupNotifyHandler");
    public final vsh b;
    public final anen c;
    public final anen d;
    public final armf e;
    public final xnv f;
    public final ujv g;
    public final uhj h;
    public final mbl i;
    public final armf j;
    public final vuo k;
    private final agnq l;
    private final armf m;
    private final uhg n;
    private final ryg o;

    public vwo(anen anenVar, anen anenVar2, vsh vshVar, agnq agnqVar, armf armfVar, armf armfVar2, xnv xnvVar, uhg uhgVar, ujv ujvVar, ryg rygVar, vuo vuoVar, uhj uhjVar, mbl mblVar, armf armfVar3) {
        this.c = anenVar;
        this.d = anenVar2;
        this.b = vshVar;
        this.l = agnqVar;
        this.m = armfVar;
        this.e = armfVar2;
        this.f = xnvVar;
        this.n = uhgVar;
        this.g = ujvVar;
        this.o = rygVar;
        this.k = vuoVar;
        this.h = uhjVar;
        this.i = mblVar;
        this.j = armfVar3;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("ProcessRcsGroupNotifyHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        vwp vwpVar = (vwp) apbtVar;
        return aktp.ai(new vmb(this, vwpVar, 13), this.d).i(new vfj(this, vwpVar, 9, null), this.c);
    }

    @Override // defpackage.unx
    public final apca e() {
        return vwp.a.getParserForType();
    }

    public final void j(final xwa xwaVar, final int i, final long j, final vwl vwlVar, Set set) {
        int i2;
        String str = vwlVar.b;
        String str2 = vwlVar.c;
        if (true == TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        tap g = rxn.g(str);
        if (i != 50020) {
            i2 = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
        } else {
            i2 = BasePaymentResult.ERROR_REQUEST_FAILED;
        }
        final int i3 = i2;
        final qwm d = this.o.d();
        tap g2 = rxn.g(str2);
        g2.v(((rxq) this.m.b()).h(g2));
        if (!set.contains(g.g)) {
            this.n.g(g, 4);
            set.add(g.g);
        }
        if (!set.contains(g2.g)) {
            this.n.g(g2, 4);
            set.add(g2.g);
        }
        final ParticipantsTable.BindData a2 = g.a();
        final ParticipantsTable.BindData a3 = g2.a();
        this.l.e("insertTombstoneForUser#insertTombstoneForUser", new Runnable() { // from class: vwm
            @Override // java.lang.Runnable
            public final void run() {
                boolean ak;
                int i4 = i;
                ParticipantsTable.BindData bindData = a3;
                ParticipantsTable.BindData bindData2 = a2;
                xwa xwaVar2 = xwaVar;
                vwo vwoVar = vwo.this;
                if (i4 == 50021) {
                    ak = ((rtz) vwoVar.e.b()).ag(bindData2, xwaVar2.a, true);
                    if (ak) {
                        xyo a4 = vwo.a.a();
                        a4.i(((iew) vwoVar.j.b()).n(bindData2, true));
                        a4.H("left");
                        a4.b(xwaVar2.a);
                        a4.q();
                    } else {
                        xyo b = vwo.a.b();
                        b.H("Failed to remove");
                        b.i(((iew) vwoVar.j.b()).n(bindData2, true));
                        b.H("from");
                        b.b(xwaVar2.a);
                        b.q();
                    }
                } else {
                    ak = ((rtz) vwoVar.e.b()).ak(bindData2, xwaVar2.a);
                    if (ak) {
                        xyo a5 = vwo.a.a();
                        a5.i(((iew) vwoVar.j.b()).n(bindData, true));
                        a5.H("added");
                        a5.i(((iew) vwoVar.j.b()).n(bindData2, true));
                        a5.H("to");
                        a5.b(xwaVar2.a);
                        a5.q();
                    } else {
                        xyo b2 = vwo.a.b();
                        b2.H("Failed to add");
                        b2.i(((iew) vwoVar.j.b()).n(bindData2, true));
                        b2.H("referred by");
                        b2.i(((iew) vwoVar.j.b()).n(bindData, true));
                        b2.H("to");
                        b2.b(xwaVar2.a);
                        b2.q();
                    }
                }
                vwl vwlVar2 = vwlVar;
                if (ak && !vwlVar2.d) {
                    long j2 = j;
                    int i5 = i3;
                    qwm qwmVar = d;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bindData2);
                    vwoVar.g.h(Optional.empty(), xwaVar2.a, qwmVar, bindData, arrayList, i5, j2, -1L);
                    return;
                }
                if (vwlVar2.d) {
                    xyo a6 = vwo.a.a();
                    a6.H("Not inserting tombstone because of self participant removal. This will happen in the scenario where the conversation is recovered from Telephony and enabled again.");
                    a6.q();
                } else {
                    xyo b3 = vwo.a.b();
                    b3.H("Not inserting tombstone because of unsuccessful add/remove of participant.");
                    b3.q();
                }
            }
        });
    }
}
