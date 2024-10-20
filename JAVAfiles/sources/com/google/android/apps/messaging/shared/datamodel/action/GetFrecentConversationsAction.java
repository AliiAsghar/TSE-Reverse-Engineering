package com.google.android.apps.messaging.shared.datamodel.action;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.service.chooser.ChooserTarget;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.agnw;
import defpackage.aiut;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.lpg;
import defpackage.lrf;
import defpackage.ort;
import defpackage.qxe;
import defpackage.qxh;
import defpackage.qyy;
import defpackage.riu;
import defpackage.ruy;
import defpackage.tvu;
import defpackage.xwx;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetFrecentConversationsAction extends Action<List<ChooserTarget>> {
    public static final Parcelable.Creator<Action<List<ChooserTarget>>> CREATOR = new qyy(14);
    private final armf a;
    private final xwx b;
    private final qxe c;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        riu cO();
    }

    public GetFrecentConversationsAction(armf armfVar, xwx xwxVar, qxe qxeVar) {
        super(amdy.GET_FRECENT_CONVERSATIONS_ACTION);
        this.a = armfVar;
        this.b = xwxVar;
        this.c = qxeVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("GetFrecentConversationsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        Icon icon;
        boolean z;
        akrh e = aktp.e("GetFrecentConversationsAction#getConversationsByFrecency");
        try {
            aiut.b();
            agnw agnwVar = (agnw) this.a.b();
            ArrayList arrayList = new ArrayList();
            Cursor query = agnwVar.j().query("conversation_frecency_view", (String[]) qxh.c.toArray(new String[0]), null, null, null, null, null);
            if (query != null) {
                int i = 1;
                while (query.moveToNext()) {
                    try {
                        qxe qxeVar = this.c;
                        xwx xwxVar = this.b;
                        ConversationIdType b = ruy.b(query.getString(0));
                        String z2 = qxeVar.f.z(query.getString(1));
                        int i2 = query.getInt(4);
                        Uri parse = Uri.parse(query.getString(2));
                        boolean c = tvu.c(i2);
                        int dimension = (int) qxeVar.b.getResources().getDimension(R.dimen.contact_icon_view_normal_size);
                        Bitmap b2 = xwxVar.b(qxeVar.b, parse, dimension, dimension, 0, !c);
                        if (b2 != null) {
                            icon = Icon.createWithBitmap(b2);
                        } else {
                            icon = null;
                        }
                        Icon icon2 = icon;
                        float f = (float) (1.0d / i);
                        Bundle bundle = new Bundle();
                        if (((ort) qxeVar.e.b()).a()) {
                            String string = query.getString(5);
                            if (query.getInt(6) > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ConversationId l = ((lrf) qxeVar.c.b()).l(b, string, z);
                            lpg.l(l, bundle);
                        } else {
                            bundle.putString("conversation_id", b.a());
                        }
                        bundle.putBoolean("via_deep_link", true);
                        arrayList.add(new ChooserTarget(z2, icon2, f, qxeVar.a, bundle));
                        i++;
                    } finally {
                    }
                }
            }
            if (query != null) {
                query.close();
            }
            e.close();
            return arrayList;
        } finally {
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.GetFrecentConversations.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public GetFrecentConversationsAction(armf armfVar, xwx xwxVar, qxe qxeVar, Parcel parcel) {
        super(parcel, amdy.GET_FRECENT_CONVERSATIONS_ACTION);
        this.a = armfVar;
        this.b = xwxVar;
        this.c = qxeVar;
    }
}
