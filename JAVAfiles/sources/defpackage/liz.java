package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class liz extends arrd implements arqw {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public liz(Object obj, int i) {
        super(3, obj, ljh.class, "transformPersonal", "transformPersonal(Lcom/google/android/apps/messaging/multishare/suggestion/PersonalSearchResults;Lcom/google/android/apps/messaging/multishare/chip/ChipsState;)Lcom/google/android/apps/messaging/multishare/suggestion/SuggestionListUiData;", 4);
        this.a = i;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zep zepVar;
        int i = this.a;
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                int i2 = 0;
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            zdq zdqVar = (zdq) obj;
                            zem zemVar = (zem) obj2;
                            String str = zdqVar.a;
                            zdi zdiVar = (zdi) this.b;
                            ArrayList arrayList = new ArrayList();
                            for (mkl mklVar : zdqVar.b) {
                                arrayList.add(zdiVar.e(mklVar, "personal_contact_".concat(mklVar.f()), zemVar, zdqVar.c));
                            }
                            return new zcx(zdqVar.a, arrayList, new zdh(zdqVar, zdiVar, 0), zdiVar.a.getString(R.string.a11y_contact_suggestions));
                        }
                        zbg zbgVar = (zbg) obj;
                        zem zemVar2 = (zem) obj2;
                        zbl zblVar = (zbl) this.b;
                        if (zbgVar.j) {
                            return new aeqj(zbgVar.g, zbgVar.h, null, zbgVar.n, 4);
                        }
                        if (zemVar2.e.isEmpty()) {
                            return null;
                        }
                        zep zepVar2 = zemVar2.d;
                        if (zepVar2.d()) {
                            return null;
                        }
                        if (zepVar2.a() && zemVar2.a.size() <= 1) {
                            return null;
                        }
                        String string = ((Context) zblVar.b).getString(R.string.start_chat_mirror_extended_fab_text);
                        string.getClass();
                        return new aeqj(string, false, aerb.s, ((yyz) zblVar.f).h((zbe) zblVar.d), 2);
                    }
                    alog alogVar = (alog) obj;
                    zem zemVar3 = (zem) obj2;
                    zas zasVar = (zas) this.b;
                    String string2 = ((Resources) zasVar.f).getString(R.string.favorites_title);
                    string2.getClass();
                    ArrayList arrayList2 = new ArrayList(aqjn.J(alogVar, 10));
                    Iterator<E> it = alogVar.iterator();
                    while (true) {
                        int i3 = i2;
                        if (it.hasNext()) {
                            Object next = it.next();
                            i2 = i3 + 1;
                            if (i3 < 0) {
                                aqjn.G();
                            }
                            arrayList2.add(new aeqo(new lhz(zasVar, (mkh) next, zemVar3, i3, 3)));
                        } else {
                            return new zat(new aeqm(string2, alzz.aZ(arrayList2)), true);
                        }
                    }
                } else {
                    zag zagVar = (zag) obj;
                    zem zemVar4 = (zem) obj2;
                    zai zaiVar = (zai) this.b;
                    if (!zagVar.a || ((zepVar = zemVar4.d) != zep.a && zepVar != zep.c)) {
                        z = false;
                    }
                    return new zaj(z, new quz(zaiVar, zagVar, 15, null));
                }
            } else {
                List list = (List) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (booleanValue) {
                    return list;
                }
                ((alvg) idy.a.g().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "ensureBannersEnabled", 105, "BannersUiAdapterImpl.kt")).q("Banners are disabled");
                return arnv.a;
            }
        } else {
            liv livVar = (liv) obj;
            lge lgeVar = (lge) obj2;
            ljh ljhVar = (ljh) this.b;
            ArrayList arrayList3 = new ArrayList();
            String str2 = livVar.a;
            if (((xca) ljhVar.d.b()).m(str2)) {
                msh n = ((msk) ljhVar.c.b()).n(str2);
                if (!lgeVar.b(n)) {
                    arrayList3.add(new liu("phone_number", new kdt((Object) ljhVar, (Object) n, (Object) lgeVar, 6, (short[]) null)));
                }
            }
            for (mkl mklVar2 : livVar.b) {
                arrayList3.add(ljhVar.e(mklVar2, "personal_contact_".concat(mklVar2.f()), lgeVar, livVar.c));
            }
            return new lix(livVar.a, arrayList3, new kfq(livVar, ljhVar, 16));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public liz(Object obj, int i, byte[] bArr) {
        super(3, obj, idy.class, "ensureBannersEnabled", "ensureBannersEnabled(Ljava/util/List;Z)Ljava/util/List;", 4);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public liz(Object obj, int i, char[] cArr) {
        super(3, obj, zai.class, "createChatbotDirectoryUiData", "createChatbotDirectoryUiData(Lcom/google/android/apps/messaging/startchat/contactlist/rbm/ChatBotInfo;Lcom/google/android/apps/messaging/startchat/tracker/ContactSelectionState;)Lcom/google/android/apps/messaging/startchat/contactlist/rbm/ChatbotDirectoryUiData;", 4);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public liz(Object obj, int i, int[] iArr) {
        super(3, obj, zbl.class, "transform", "transform(Lcom/google/android/apps/messaging/startchat/groupname/GroupNameUiData;Lcom/google/android/apps/messaging/startchat/tracker/ContactSelectionState;)Lcom/google/android/libraries/communications/ux/components/extendedfab/ExtendedFabUiData;", 4);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public liz(Object obj, int i, short[] sArr) {
        super(3, obj, zas.class, "transform", "transform(Lcom/google/common/collect/ImmutableList;Lcom/google/android/apps/messaging/startchat/tracker/ContactSelectionState;)Lcom/google/android/apps/messaging/startchat/favorites/FavoriteContactsUiData;", 4);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public liz(Object obj, int i, boolean[] zArr) {
        super(3, obj, zdi.class, "transformPersonal", "transformPersonal(Lcom/google/android/apps/messaging/startchat/suggestion/PersonalSearchResults;Lcom/google/android/apps/messaging/startchat/tracker/ContactSelectionState;)Lcom/google/android/apps/messaging/startchat/suggestion/ContactSuggestionListUiData;", 4);
        this.a = i;
    }
}
