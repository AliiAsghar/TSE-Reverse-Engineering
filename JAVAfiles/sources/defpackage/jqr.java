package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jqr extends arrd implements arqv {
    public static final jqr a = new jqr();

    public jqr() {
        super(2, sph.class, "setText", "setText(Ljava/lang/String;)Lcom/google/android/apps/messaging/shared/datamodel/databasegen/tabledefinitions/DraftsTable$UpdateBuilder;", 8);
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        sph sphVar = (sph) obj;
        sphVar.getClass();
        agnc.r(sphVar.a, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, (String) obj2);
        return arnb.a;
    }
}
