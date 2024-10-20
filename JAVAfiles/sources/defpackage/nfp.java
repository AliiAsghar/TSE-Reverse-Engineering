package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nfp implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ nfp(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
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
        switch (this.a) {
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
        switch (this.a) {
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

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean isPresent;
        boolean isPresent2;
        switch (this.a) {
            case 0:
                alwo alwoVar = nfq.a;
                return ((msh) obj).e().isPresent();
            case 1:
                return Objects.nonNull((String) obj);
            case 2:
                isPresent = ((Optional) obj).isPresent();
                return isPresent;
            case 3:
                return ((Optional) obj).isEmpty();
            case 4:
                return d.an((String) obj);
            case 5:
                int i = qba.a;
                qfe b = qfe.b(((qff) obj).d);
                if (b == null) {
                    b = qfe.UNKNOWN_STATE;
                }
                return b.equals(qfe.JOINED);
            case 6:
                return d.L((ParticipantsTable.BindData) obj);
            case 7:
                int i2 = qbc.b;
                if (((sbo) obj).g() != null) {
                    return true;
                }
                return false;
            case 8:
                return qbd.b((qff) obj).equals(qfh.MEMBERSHIP_CONFIRMED);
            case 9:
                return d.L((ParticipantsTable.BindData) obj);
            case 10:
                if (((sbo) obj).f() == qfe.JOINED) {
                    return true;
                }
                return false;
            case 11:
                isPresent2 = ((Optional) obj).isPresent();
                return isPresent2;
            case 12:
                alhr alhrVar = qdc.a;
                return ((ContentType) obj).e(ajru.g);
            case 13:
                ContentType contentType = (ContentType) obj;
                alhr alhrVar2 = qdc.a;
                if (contentType.e(ajru.e) || contentType.e(ajru.c) || contentType.e(ajru.b) || contentType.e(ajru.f)) {
                    return true;
                }
                return false;
            case 14:
                return d.L((ParticipantsTable.BindData) obj);
            case 15:
                if (((ParticipantsTable.BindData) obj).G() != null) {
                    return true;
                }
                return false;
            case 16:
                return d.L((ParticipantsTable.BindData) obj);
            case 17:
                if (((ParticipantsTable.BindData) obj).P() != null) {
                    return true;
                }
                return false;
            case 18:
                if (!albo.ah((String) obj)) {
                    return true;
                }
                return false;
            case 19:
                alvi alviVar = qqw.a;
                if (!albo.ah(((msh) obj).k())) {
                    return true;
                }
                return false;
            default:
                if (!Instant.EPOCH.equals(((pto) obj).b())) {
                    return true;
                }
                return false;
        }
    }
}
