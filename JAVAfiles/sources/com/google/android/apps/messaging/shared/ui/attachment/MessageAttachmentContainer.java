package com.google.android.apps.messaging.shared.ui.attachment;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import defpackage.armf;
import defpackage.ibx;
import defpackage.kor;
import defpackage.utz;
import defpackage.voe;
import defpackage.vog;
import defpackage.voh;
import defpackage.xpw;
import defpackage.xum;
import defpackage.xuo;
import defpackage.xuu;
import defpackage.xuw;
import defpackage.xzb;
import defpackage.znj;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MessageAttachmentContainer extends xuw {
    public List a;
    public xuo b;
    public final Map c;
    public final List d;
    public xum e;
    public armf f;
    public kor g;
    private voe h;
    private final LayoutInflater i;

    public MessageAttachmentContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.c = new HashMap();
        this.d = new ArrayList();
        this.i = LayoutInflater.from(context);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [xun, java.lang.Object] */
    public final void a(xuu xuuVar) {
        Uri t;
        Uri t2;
        List list = xuuVar.a;
        if (list.size() == this.a.size() && ((!this.g.c().isPresent() || Objects.equals(xuuVar.e, this.h)) && Objects.equals(null, null))) {
            for (int i = 0; i < this.a.size(); i++) {
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) this.a.get(i);
                MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) list.get(i);
                if (((Boolean) this.f.b()).booleanValue()) {
                    if (messagePartCoreData.v() != null) {
                        t = messagePartCoreData.v();
                    } else {
                        t = messagePartCoreData.t();
                    }
                    if (messagePartCoreData2.v() != null) {
                        t2 = messagePartCoreData2.v();
                    } else {
                        t2 = messagePartCoreData2.t();
                    }
                } else {
                    t = messagePartCoreData.t();
                    t2 = messagePartCoreData2.t();
                }
                Uri x = messagePartCoreData.x();
                String U = messagePartCoreData.U();
                String U2 = messagePartCoreData2.U();
                if ((t != null || x != null) && U != null && ((t == null || (t.equals(t2) && U.equals(U2))) && ((x == null || x.equals(messagePartCoreData2.x())) && (!((Boolean) ((utz) ibx.a.get()).e()).booleanValue() || Objects.equals(messagePartCoreData.E(), messagePartCoreData2.E()))))) {
                }
            }
            return;
        }
        List<MessagePartCoreData> list2 = xuuVar.a;
        removeAllViews();
        this.c.clear();
        ArrayList arrayList = new ArrayList();
        Optional c = this.g.c();
        boolean isPresent = c.isPresent();
        for (MessagePartCoreData messagePartCoreData3 : list2) {
            if (isPresent && messagePartCoreData3.bi()) {
                arrayList.add(messagePartCoreData3);
            } else if (!messagePartCoreData3.bm()) {
                xzb.j("Bugle", "Skipped displaying non-media attachment part ".concat(String.valueOf(String.valueOf(messagePartCoreData3))));
            } else {
                znj g = this.e.g(this.i, messagePartCoreData3, this, 1, xuuVar.b);
                if (g == null) {
                    xzb.n("Bugle", "Generated null attachment preview for part ".concat(String.valueOf(String.valueOf(messagePartCoreData3))));
                } else {
                    ?? r7 = g.a;
                    if (r7 != 0) {
                        r7.g(messagePartCoreData3, xuuVar.c, 1);
                    }
                    if (g.b != null) {
                        b(messagePartCoreData3);
                        this.d.add(g);
                        addView((View) g.b);
                        if (messagePartCoreData3.aW() && (r7 instanceof AudioAttachmentView)) {
                            ((AudioAttachmentView) r7).b(this.b);
                        }
                    } else {
                        xzb.n("Bugle", "Skipped adding attachment view for part ".concat(String.valueOf(String.valueOf(messagePartCoreData3))));
                    }
                }
            }
        }
        if (isPresent) {
            if (!arrayList.isEmpty()) {
                voh vohVar = (voh) c.get();
                getContext();
                vog a = vohVar.a();
                a.b();
                addView(a.a());
                Collection.EL.stream(arrayList).forEach(new xpw(this, 15));
            }
            this.h = xuuVar.e;
        }
        this.a = list2;
    }

    public final void b(MessagePartCoreData messagePartCoreData) {
        Uri t = messagePartCoreData.t();
        Uri x = messagePartCoreData.x();
        if (t != null) {
            this.c.put(t, Integer.valueOf(getChildCount()));
        }
        if (x != null) {
            this.c.put(x, Integer.valueOf(getChildCount()));
        }
    }
}
