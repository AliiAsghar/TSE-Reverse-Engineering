package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rrz {
    public static final /* synthetic */ int b = 0;
    private static final Comparator c = Comparator.EL.thenComparing(Comparator.CC.comparing(new rrv(7), Comparator.CC.nullsLast(Comparator.CC.naturalOrder())), new rrv(8), Comparator.CC.nullsLast(Comparator.CC.naturalOrder()));
    public final wfh a;
    private final Context d;
    private final armf e;
    private final armf f;

    static {
        Comparator.EL.thenComparing(Comparator.CC.comparing(new rrv(9), Comparator.CC.nullsLast(Comparator.CC.naturalOrder())), new rrv(10), Comparator.CC.nullsLast(Comparator.CC.naturalOrder()));
    }

    public rrz(Context context, wfh wfhVar, armf armfVar, armf armfVar2) {
        this.d = context;
        this.a = wfhVar;
        this.e = armfVar;
        this.f = armfVar2;
    }

    public static String c(String str, vox voxVar) {
        if (oez.a() && voxVar == vox.PROFILE_PEOPLE_SHARING_SOURCE) {
            return null;
        }
        return str;
    }

    private final String e(ParticipantsTable.BindData bindData) {
        String n = ((iew) this.e.b()).n(bindData, true);
        String J = bindData.J();
        if (bindData.B() == vox.PROFILE_PEOPLE_SHARING_SOURCE) {
            if (!TextUtils.isEmpty(J)) {
                return J;
            }
            return this.d.getResources().getString(R.string.unknown_sender);
        }
        return n;
    }

    public final String a(ryt rytVar) {
        alog alogVar;
        if (rytVar.b.isEmpty()) {
            alogVar = rytVar.a;
        } else {
            alogVar = rytVar.b;
        }
        if (!alogVar.isEmpty()) {
            boolean z = true;
            if (alogVar.size() != 1) {
                z = false;
            }
            return (String) Collection.EL.stream(alogVar).sorted(c).map(new lch(this, z, 5)).filter(new qxi(13)).collect(Collectors.collectingAndThen(Collectors.joining(", "), new rpf(this, 15)));
        }
        return this.d.getString(R.string.group_conversation_title_everyone_else_left);
    }

    @Deprecated
    public final String b(List list) {
        String n;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<ParticipantsTable.BindData> arrayList = new ArrayList(list);
            Collections.sort(arrayList, c);
            boolean z = true;
            if (((alsx) list).c != 1) {
                z = false;
            }
            ArrayList arrayList2 = new ArrayList();
            for (ParticipantsTable.BindData bindData : arrayList) {
                if (((Boolean) this.f.b()).booleanValue()) {
                    n = e(bindData);
                } else {
                    n = ((iew) this.e.b()).n(bindData, z);
                }
                if (qta.r()) {
                    arrayList2.add(wfh.x(n));
                } else {
                    arrayList2.add(n);
                }
            }
            algs algsVar = new algs(", ");
            algq algqVar = new algq(algsVar, algsVar);
            if (qta.r()) {
                return algqVar.d(arrayList2);
            }
            return this.a.z(algqVar.d(arrayList2));
        }
        return this.d.getString(R.string.group_conversation_title_everyone_else_left);
    }

    public final String d(ParticipantsTable.BindData bindData, boolean z) {
        if (((Boolean) this.f.b()).booleanValue()) {
            return e(bindData);
        }
        return ((iew) this.e.b()).n(bindData, z);
    }
}
