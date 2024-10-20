package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rsg {
    public static final xze a = xze.g("Bugle", "ConversationSettingsItemData");
    public String b;
    public String c;
    public Uri d;
    public boolean e;
    public boolean f;
    public boolean g;
    public rse h;
    public boolean i;
    public ParticipantsTable.BindData j;
    public ParticipantsTable.BindData k;
    public tqc l;
    public final yhw m;
    public final xbf n;
    public final xxe o;
    public final Context p;
    public final trz q;

    public rsg(yhw yhwVar, xbf xbfVar, xxe xxeVar, trz trzVar, Context context) {
        this.m = yhwVar;
        this.n = xbfVar;
        this.o = xxeVar;
        this.p = context;
        this.q = trzVar;
    }

    public final ParticipantsTable.BindData a() {
        ParticipantsTable.BindData bindData = this.j;
        if (bindData != null) {
            return bindData;
        }
        return this.k;
    }
}
