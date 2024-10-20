package defpackage;

import android.net.NetworkCapabilities;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.gms.constellation.PhoneNumberInfo;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xdm implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xdm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
            case 0:
                return Predicate$CC.$default$and(this, predicate);
            case 1:
                return Predicate$CC.$default$and(this, predicate);
            case 2:
                return Predicate$CC.$default$and(this, predicate);
            case 3:
                return Predicate$CC.$default$and(this, predicate);
            case 4:
                return Predicate$CC.$default$and(this, predicate);
            case 5:
                return Predicate$CC.$default$and(this, predicate);
            case 6:
                return Predicate$CC.$default$and(this, predicate);
            case 7:
                return Predicate$CC.$default$and(this, predicate);
            case 8:
                return Predicate$CC.$default$and(this, predicate);
            case 9:
                return Predicate$CC.$default$and(this, predicate);
            case 10:
                return Predicate$CC.$default$and(this, predicate);
            case 11:
                return Predicate$CC.$default$and(this, predicate);
            case 12:
                return Predicate$CC.$default$and(this, predicate);
            case 13:
                return Predicate$CC.$default$and(this, predicate);
            case 14:
                return Predicate$CC.$default$and(this, predicate);
            case 15:
                return Predicate$CC.$default$and(this, predicate);
            case 16:
                return Predicate$CC.$default$and(this, predicate);
            case 17:
                return Predicate$CC.$default$and(this, predicate);
            case 18:
                return Predicate$CC.$default$and(this, predicate);
            case 19:
                return Predicate$CC.$default$and(this, predicate);
            default:
                return Predicate$CC.$default$and(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo407negate() {
        switch (this.b) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            case 2:
                return Predicate$CC.$default$negate(this);
            case 3:
                return Predicate$CC.$default$negate(this);
            case 4:
                return Predicate$CC.$default$negate(this);
            case 5:
                return Predicate$CC.$default$negate(this);
            case 6:
                return Predicate$CC.$default$negate(this);
            case 7:
                return Predicate$CC.$default$negate(this);
            case 8:
                return Predicate$CC.$default$negate(this);
            case 9:
                return Predicate$CC.$default$negate(this);
            case 10:
                return Predicate$CC.$default$negate(this);
            case 11:
                return Predicate$CC.$default$negate(this);
            case 12:
                return Predicate$CC.$default$negate(this);
            case 13:
                return Predicate$CC.$default$negate(this);
            case 14:
                return Predicate$CC.$default$negate(this);
            case 15:
                return Predicate$CC.$default$negate(this);
            case 16:
                return Predicate$CC.$default$negate(this);
            case 17:
                return Predicate$CC.$default$negate(this);
            case 18:
                return Predicate$CC.$default$negate(this);
            case 19:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.b) {
            case 0:
                return Predicate$CC.$default$or(this, predicate);
            case 1:
                return Predicate$CC.$default$or(this, predicate);
            case 2:
                return Predicate$CC.$default$or(this, predicate);
            case 3:
                return Predicate$CC.$default$or(this, predicate);
            case 4:
                return Predicate$CC.$default$or(this, predicate);
            case 5:
                return Predicate$CC.$default$or(this, predicate);
            case 6:
                return Predicate$CC.$default$or(this, predicate);
            case 7:
                return Predicate$CC.$default$or(this, predicate);
            case 8:
                return Predicate$CC.$default$or(this, predicate);
            case 9:
                return Predicate$CC.$default$or(this, predicate);
            case 10:
                return Predicate$CC.$default$or(this, predicate);
            case 11:
                return Predicate$CC.$default$or(this, predicate);
            case 12:
                return Predicate$CC.$default$or(this, predicate);
            case 13:
                return Predicate$CC.$default$or(this, predicate);
            case 14:
                return Predicate$CC.$default$or(this, predicate);
            case 15:
                return Predicate$CC.$default$or(this, predicate);
            case 16:
                return Predicate$CC.$default$or(this, predicate);
            case 17:
                return Predicate$CC.$default$or(this, predicate);
            case 18:
                return Predicate$CC.$default$or(this, predicate);
            case 19:
                return Predicate$CC.$default$or(this, predicate);
            default:
                return Predicate$CC.$default$or(this, predicate);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Set, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean booleanValue;
        boolean booleanValue2;
        boolean z = true;
        switch (this.b) {
            case 0:
                alwo alwoVar = xdn.a;
                return this.a.containsKey(((anlu) obj).a.c);
            case 1:
                booleanValue = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue;
            case 2:
                alwo alwoVar2 = xew.a;
                if (!((alpt) this.a).contains((qes) obj)) {
                    return true;
                }
                return false;
            case 3:
                alwo alwoVar3 = xfw.a;
                if (!this.a.contains(((Map.Entry) obj).getKey())) {
                    return true;
                }
                return false;
            case 4:
                Uri uri = (Uri) obj;
                xze xzeVar = xiu.a;
                if (((String) this.a).equals(uri.getAuthority())) {
                    if (uri.getPathSegments().size() != 1) {
                        xyo e = xiu.a.e();
                        e.H("Found message URI with number of path segments != 1.");
                        e.z("Uri", uri);
                        e.q();
                    } else {
                        try {
                            Long.parseLong(uri.getPathSegments().get(0));
                            return true;
                        } catch (NumberFormatException unused) {
                            xyo e2 = xiu.a.e();
                            e2.H("Failed to parse message id from message Uri.");
                            e2.z("Uri", uri);
                            e2.q();
                        }
                    }
                }
                return false;
            case 5:
                wyf wyfVar = (wyf) obj;
                xze xzeVar2 = xiu.a;
                for (wyf wyfVar2 : ((wye) this.a).x) {
                    if (wyfVar2 != null && wyfVar != null && Objects.equals(wyfVar2.f, wyfVar.f) && wyfVar2.h == wyfVar.h) {
                        return true;
                    }
                }
                return false;
            case 6:
                PartsTable.BindData bindData = (PartsTable.BindData) obj;
                xze xzeVar3 = xiu.a;
                String str = ((wyf) this.a).f;
                if (str == null || str.equals(bindData.B())) {
                    return true;
                }
                return false;
            case 7:
                xze xzeVar4 = xiu.a;
                if (!((alog) this.a).contains((wyc) ((wyb) obj))) {
                    return true;
                }
                return false;
            case 8:
                xze xzeVar5 = xiu.a;
                if (!((alog) this.a).contains((wyb) obj)) {
                    return true;
                }
                return false;
            case 9:
                qeq qeqVar = (qeq) obj;
                if (qeqVar != null && !qeq.a.equals(qeqVar)) {
                    xot xotVar = (xot) this.a;
                    Instant f = xotVar.d.f();
                    qep qepVar = qeqVar.c;
                    if (qepVar == null) {
                        qepVar = qep.a;
                    }
                    apct apctVar = qepVar.g;
                    if (apctVar == null) {
                        apctVar = apct.a;
                    }
                    if (Duration.ofMillis(((Long) xot.b.e()).longValue()).compareTo(Duration.between(f, aotl.l(apctVar))) > 0) {
                        z = false;
                    }
                    if (!z) {
                        alwl alwlVar = (alwl) ((alwl) xot.a.i()).h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "isFileUploadResponseValid", 291, "FileTransferDatabaseOperations.java");
                        Instant f2 = xotVar.d.f();
                        qep qepVar2 = qeqVar.c;
                        if (qepVar2 == null) {
                            qepVar2 = qep.a;
                        }
                        apct apctVar2 = qepVar2.g;
                        if (apctVar2 == null) {
                            apctVar2 = apct.a;
                        }
                        alwlVar.D("FileUploadResponse timestamp is not valid. Current time: %s. File was valid until %s.", f2, aotl.l(apctVar2));
                    }
                    return z;
                }
                ((alwl) ((alwl) xot.a.i()).h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "isFileUploadResponseValid", 281, "FileTransferDatabaseOperations.java")).q("FileUploadResponse is not valid because it is null");
                return false;
            case 10:
                return ((Enum) this.a).equals((ajqd) obj);
            case 11:
                return ((xvs) this.a).e.c(adom.n((adiv) obj).a).n;
            case 12:
                return ((xvs) this.a).e.c(adom.n((adiv) obj).a).u;
            case 13:
                alvi alviVar = yav.d;
                return ((NetworkCapabilities) this.a).hasTransport(((yau) obj).a);
            case 14:
                return ydk.x((Uri) this.a, (String) obj);
            case 15:
                xze xzeVar6 = yee.a;
                if (((yek) this.a).a((String) obj) != null) {
                    return true;
                }
                return false;
            case 16:
                booleanValue2 = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue2;
            case 17:
                return ((String) this.a).equals(((PhoneNumberInfo) obj).b);
            case 18:
                ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) obj;
                boolean booleanValue3 = ((Boolean) new mst(12).get()).booleanValue();
                Object obj2 = this.a;
                if (booleanValue3) {
                    return ((msk) ((yvs) obj2).g.b()).q(bindData2).q();
                }
                String O = bindData2.O();
                if (O != null && ((yjr) ((yvs) obj2).c.b()).C(O)) {
                    return true;
                }
                return false;
            case 19:
                if (!((yvs) this.a).e((ParticipantsTable.BindData) obj)) {
                    return true;
                }
                return false;
            default:
                if (!((yvs) this.a).h((ParticipantsTable.BindData) obj)) {
                    return true;
                }
                return false;
        }
    }
}
