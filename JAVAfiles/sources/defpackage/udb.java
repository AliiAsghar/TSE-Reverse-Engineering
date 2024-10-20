package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.vcard.VCardConfig;
import j$.util.concurrent.ThreadLocalRandom;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class udb implements uco {
    public final apwt a;
    public final AtomicInteger b = new AtomicInteger(0);
    private final apwt c;
    private final armf d;
    private final armf e;

    public udb(apwt apwtVar, apwt apwtVar2, armf armfVar, armf armfVar2) {
        this.a = apwtVar;
        this.c = apwtVar2;
        this.d = armfVar;
        this.e = armfVar2;
    }

    @Override // defpackage.uco
    public final /* synthetic */ int e(Exception exc, int i, ude udeVar) {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.uco
    public final Closeable l(final ude udeVar) {
        agng agngVar;
        agni agniVar = udeVar.a;
        if (xyp.j() && (agniVar == null || agniVar.b())) {
            throw new IllegalStateException("required logging tag is missing");
        }
        if (agniVar == null || agniVar.b()) {
            if (((oyx) this.e.b()).a()) {
                agniVar = new agni("unknown_query");
            } else {
                return null;
            }
        }
        String agniVar2 = agniVar.toString();
        if (!agni.b.toString().equals(agniVar2) && !agni.c.toString().equals(agniVar2)) {
            final aozy createBuilder = amjr.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amjr amjrVar = (amjr) createBuilder.b;
            amjrVar.b |= 2;
            amjrVar.d = agniVar2;
            switch (udeVar.b) {
                case QUERY:
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amjr amjrVar2 = (amjr) createBuilder.b;
                    amjrVar2.c = 1;
                    amjrVar2.b = 1 | amjrVar2.b;
                    int andIncrement = this.b.getAndIncrement();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amjr amjrVar3 = (amjr) createBuilder.b;
                    amjrVar3.b |= 32;
                    amjrVar3.h = andIncrement;
                    final xnv xnvVar = (xnv) this.c.b();
                    final long millis = xnvVar.d().toMillis();
                    final long a = xnvVar.a();
                    agngVar = new agng() { // from class: uda
                        @Override // defpackage.agng
                        public final void a() {
                            udb udbVar = udb.this;
                            ude udeVar2 = udeVar;
                            if (udeVar2.b == udf.QUERY) {
                                udbVar.b.getAndDecrement();
                            }
                            aozy aozyVar = createBuilder;
                            maq maqVar = (maq) udbVar.a.b();
                            int intValue = udeVar2.f.intValue();
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j = a;
                            xnv xnvVar2 = xnvVar;
                            amjr amjrVar4 = (amjr) aozyVar.b;
                            amjr amjrVar5 = amjr.a;
                            amjrVar4.b |= 4;
                            amjrVar4.e = intValue;
                            long a2 = xnvVar2.a() - j;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j2 = millis;
                            amjr amjrVar6 = (amjr) aozyVar.b;
                            amjrVar6.b |= 8;
                            amjrVar6.f = a2;
                            long millis2 = xnvVar2.d().toMillis() - j2;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            amjr amjrVar7 = (amjr) aozyVar.b;
                            amjrVar7.b |= 16;
                            amjrVar7.g = millis2;
                            amfq amfqVar = (amfq) amfr.a.createBuilder();
                            amfp amfpVar = amfp.DATABASE_OPERATION;
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar = (amfr) amfqVar.b;
                            amfrVar.i = amfpVar.dg;
                            amfrVar.b |= 1;
                            amjr amjrVar8 = (amjr) aozyVar.s();
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar2 = (amfr) amfqVar.b;
                            amjrVar8.getClass();
                            amfrVar2.bc = amjrVar8;
                            amfrVar2.f |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                            maqVar.n(amfqVar);
                        }
                    };
                    break;
                case READ:
                case WRITE:
                case BEGIN_NESTED_TRANSACTION:
                case END_NESTED_TRANSACTION:
                case BEGIN_SCOPE:
                case END_SCOPE:
                case CLOSE:
                    agngVar = new agng() { // from class: ucy
                        @Override // defpackage.agng
                        public final void a() {
                        }
                    };
                    break;
                case INSERT:
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amjr amjrVar4 = (amjr) createBuilder.b;
                    amjrVar4.c = 2;
                    amjrVar4.b = 1 | amjrVar4.b;
                    final xnv xnvVar2 = (xnv) this.c.b();
                    final long millis2 = xnvVar2.d().toMillis();
                    final long a2 = xnvVar2.a();
                    agngVar = new agng() { // from class: uda
                        @Override // defpackage.agng
                        public final void a() {
                            udb udbVar = udb.this;
                            ude udeVar2 = udeVar;
                            if (udeVar2.b == udf.QUERY) {
                                udbVar.b.getAndDecrement();
                            }
                            aozy aozyVar = createBuilder;
                            maq maqVar = (maq) udbVar.a.b();
                            int intValue = udeVar2.f.intValue();
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j = a2;
                            xnv xnvVar22 = xnvVar2;
                            amjr amjrVar42 = (amjr) aozyVar.b;
                            amjr amjrVar5 = amjr.a;
                            amjrVar42.b |= 4;
                            amjrVar42.e = intValue;
                            long a22 = xnvVar22.a() - j;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j2 = millis2;
                            amjr amjrVar6 = (amjr) aozyVar.b;
                            amjrVar6.b |= 8;
                            amjrVar6.f = a22;
                            long millis22 = xnvVar22.d().toMillis() - j2;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            amjr amjrVar7 = (amjr) aozyVar.b;
                            amjrVar7.b |= 16;
                            amjrVar7.g = millis22;
                            amfq amfqVar = (amfq) amfr.a.createBuilder();
                            amfp amfpVar = amfp.DATABASE_OPERATION;
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar = (amfr) amfqVar.b;
                            amfrVar.i = amfpVar.dg;
                            amfrVar.b |= 1;
                            amjr amjrVar8 = (amjr) aozyVar.s();
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar2 = (amfr) amfqVar.b;
                            amjrVar8.getClass();
                            amfrVar2.bc = amjrVar8;
                            amfrVar2.f |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                            maqVar.n(amfqVar);
                        }
                    };
                    break;
                case DELETE:
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amjr amjrVar5 = (amjr) createBuilder.b;
                    amjrVar5.c = 4;
                    amjrVar5.b = 1 | amjrVar5.b;
                    final xnv xnvVar22 = (xnv) this.c.b();
                    final long millis22 = xnvVar22.d().toMillis();
                    final long a22 = xnvVar22.a();
                    agngVar = new agng() { // from class: uda
                        @Override // defpackage.agng
                        public final void a() {
                            udb udbVar = udb.this;
                            ude udeVar2 = udeVar;
                            if (udeVar2.b == udf.QUERY) {
                                udbVar.b.getAndDecrement();
                            }
                            aozy aozyVar = createBuilder;
                            maq maqVar = (maq) udbVar.a.b();
                            int intValue = udeVar2.f.intValue();
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j = a22;
                            xnv xnvVar222 = xnvVar22;
                            amjr amjrVar42 = (amjr) aozyVar.b;
                            amjr amjrVar52 = amjr.a;
                            amjrVar42.b |= 4;
                            amjrVar42.e = intValue;
                            long a222 = xnvVar222.a() - j;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j2 = millis22;
                            amjr amjrVar6 = (amjr) aozyVar.b;
                            amjrVar6.b |= 8;
                            amjrVar6.f = a222;
                            long millis222 = xnvVar222.d().toMillis() - j2;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            amjr amjrVar7 = (amjr) aozyVar.b;
                            amjrVar7.b |= 16;
                            amjrVar7.g = millis222;
                            amfq amfqVar = (amfq) amfr.a.createBuilder();
                            amfp amfpVar = amfp.DATABASE_OPERATION;
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar = (amfr) amfqVar.b;
                            amfrVar.i = amfpVar.dg;
                            amfrVar.b |= 1;
                            amjr amjrVar8 = (amjr) aozyVar.s();
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar2 = (amfr) amfqVar.b;
                            amjrVar8.getClass();
                            amfrVar2.bc = amjrVar8;
                            amfrVar2.f |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                            maqVar.n(amfqVar);
                        }
                    };
                    break;
                case UPDATE:
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amjr amjrVar6 = (amjr) createBuilder.b;
                    amjrVar6.c = 3;
                    amjrVar6.b = 1 | amjrVar6.b;
                    final xnv xnvVar222 = (xnv) this.c.b();
                    final long millis222 = xnvVar222.d().toMillis();
                    final long a222 = xnvVar222.a();
                    agngVar = new agng() { // from class: uda
                        @Override // defpackage.agng
                        public final void a() {
                            udb udbVar = udb.this;
                            ude udeVar2 = udeVar;
                            if (udeVar2.b == udf.QUERY) {
                                udbVar.b.getAndDecrement();
                            }
                            aozy aozyVar = createBuilder;
                            maq maqVar = (maq) udbVar.a.b();
                            int intValue = udeVar2.f.intValue();
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j = a222;
                            xnv xnvVar2222 = xnvVar222;
                            amjr amjrVar42 = (amjr) aozyVar.b;
                            amjr amjrVar52 = amjr.a;
                            amjrVar42.b |= 4;
                            amjrVar42.e = intValue;
                            long a2222 = xnvVar2222.a() - j;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j2 = millis222;
                            amjr amjrVar62 = (amjr) aozyVar.b;
                            amjrVar62.b |= 8;
                            amjrVar62.f = a2222;
                            long millis2222 = xnvVar2222.d().toMillis() - j2;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            amjr amjrVar7 = (amjr) aozyVar.b;
                            amjrVar7.b |= 16;
                            amjrVar7.g = millis2222;
                            amfq amfqVar = (amfq) amfr.a.createBuilder();
                            amfp amfpVar = amfp.DATABASE_OPERATION;
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar = (amfr) amfqVar.b;
                            amfrVar.i = amfpVar.dg;
                            amfrVar.b |= 1;
                            amjr amjrVar8 = (amjr) aozyVar.s();
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar2 = (amfr) amfqVar.b;
                            amjrVar8.getClass();
                            amfrVar2.bc = amjrVar8;
                            amfrVar2.f |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                            maqVar.n(amfqVar);
                        }
                    };
                    break;
                case BEGIN_TRANSACTION:
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amjr amjrVar7 = (amjr) createBuilder.b;
                    amjrVar7.c = 6;
                    amjrVar7.b = 1 | amjrVar7.b;
                    final xnv xnvVar2222 = (xnv) this.c.b();
                    final long millis2222 = xnvVar2222.d().toMillis();
                    final long a2222 = xnvVar2222.a();
                    agngVar = new agng() { // from class: uda
                        @Override // defpackage.agng
                        public final void a() {
                            udb udbVar = udb.this;
                            ude udeVar2 = udeVar;
                            if (udeVar2.b == udf.QUERY) {
                                udbVar.b.getAndDecrement();
                            }
                            aozy aozyVar = createBuilder;
                            maq maqVar = (maq) udbVar.a.b();
                            int intValue = udeVar2.f.intValue();
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j = a2222;
                            xnv xnvVar22222 = xnvVar2222;
                            amjr amjrVar42 = (amjr) aozyVar.b;
                            amjr amjrVar52 = amjr.a;
                            amjrVar42.b |= 4;
                            amjrVar42.e = intValue;
                            long a22222 = xnvVar22222.a() - j;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j2 = millis2222;
                            amjr amjrVar62 = (amjr) aozyVar.b;
                            amjrVar62.b |= 8;
                            amjrVar62.f = a22222;
                            long millis22222 = xnvVar22222.d().toMillis() - j2;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            amjr amjrVar72 = (amjr) aozyVar.b;
                            amjrVar72.b |= 16;
                            amjrVar72.g = millis22222;
                            amfq amfqVar = (amfq) amfr.a.createBuilder();
                            amfp amfpVar = amfp.DATABASE_OPERATION;
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar = (amfr) amfqVar.b;
                            amfrVar.i = amfpVar.dg;
                            amfrVar.b |= 1;
                            amjr amjrVar8 = (amjr) aozyVar.s();
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar2 = (amfr) amfqVar.b;
                            amjrVar8.getClass();
                            amfrVar2.bc = amjrVar8;
                            amfrVar2.f |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                            maqVar.n(amfqVar);
                        }
                    };
                    break;
                case END_TRANSACTION:
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amjr amjrVar8 = (amjr) createBuilder.b;
                    amjrVar8.c = 8;
                    amjrVar8.b = 1 | amjrVar8.b;
                    final xnv xnvVar22222 = (xnv) this.c.b();
                    final long millis22222 = xnvVar22222.d().toMillis();
                    final long a22222 = xnvVar22222.a();
                    agngVar = new agng() { // from class: uda
                        @Override // defpackage.agng
                        public final void a() {
                            udb udbVar = udb.this;
                            ude udeVar2 = udeVar;
                            if (udeVar2.b == udf.QUERY) {
                                udbVar.b.getAndDecrement();
                            }
                            aozy aozyVar = createBuilder;
                            maq maqVar = (maq) udbVar.a.b();
                            int intValue = udeVar2.f.intValue();
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j = a22222;
                            xnv xnvVar222222 = xnvVar22222;
                            amjr amjrVar42 = (amjr) aozyVar.b;
                            amjr amjrVar52 = amjr.a;
                            amjrVar42.b |= 4;
                            amjrVar42.e = intValue;
                            long a222222 = xnvVar222222.a() - j;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j2 = millis22222;
                            amjr amjrVar62 = (amjr) aozyVar.b;
                            amjrVar62.b |= 8;
                            amjrVar62.f = a222222;
                            long millis222222 = xnvVar222222.d().toMillis() - j2;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            amjr amjrVar72 = (amjr) aozyVar.b;
                            amjrVar72.b |= 16;
                            amjrVar72.g = millis222222;
                            amfq amfqVar = (amfq) amfr.a.createBuilder();
                            amfp amfpVar = amfp.DATABASE_OPERATION;
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar = (amfr) amfqVar.b;
                            amfrVar.i = amfpVar.dg;
                            amfrVar.b |= 1;
                            amjr amjrVar82 = (amjr) aozyVar.s();
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar2 = (amfr) amfqVar.b;
                            amjrVar82.getClass();
                            amfrVar2.bc = amjrVar82;
                            amfrVar2.f |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                            maqVar.n(amfqVar);
                        }
                    };
                    break;
                case RAW_SQL:
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amjr amjrVar9 = (amjr) createBuilder.b;
                    amjrVar9.c = 7;
                    amjrVar9.b = 1 | amjrVar9.b;
                    final xnv xnvVar222222 = (xnv) this.c.b();
                    final long millis222222 = xnvVar222222.d().toMillis();
                    final long a222222 = xnvVar222222.a();
                    agngVar = new agng() { // from class: uda
                        @Override // defpackage.agng
                        public final void a() {
                            udb udbVar = udb.this;
                            ude udeVar2 = udeVar;
                            if (udeVar2.b == udf.QUERY) {
                                udbVar.b.getAndDecrement();
                            }
                            aozy aozyVar = createBuilder;
                            maq maqVar = (maq) udbVar.a.b();
                            int intValue = udeVar2.f.intValue();
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j = a222222;
                            xnv xnvVar2222222 = xnvVar222222;
                            amjr amjrVar42 = (amjr) aozyVar.b;
                            amjr amjrVar52 = amjr.a;
                            amjrVar42.b |= 4;
                            amjrVar42.e = intValue;
                            long a2222222 = xnvVar2222222.a() - j;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j2 = millis222222;
                            amjr amjrVar62 = (amjr) aozyVar.b;
                            amjrVar62.b |= 8;
                            amjrVar62.f = a2222222;
                            long millis2222222 = xnvVar2222222.d().toMillis() - j2;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            amjr amjrVar72 = (amjr) aozyVar.b;
                            amjrVar72.b |= 16;
                            amjrVar72.g = millis2222222;
                            amfq amfqVar = (amfq) amfr.a.createBuilder();
                            amfp amfpVar = amfp.DATABASE_OPERATION;
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar = (amfr) amfqVar.b;
                            amfrVar.i = amfpVar.dg;
                            amfrVar.b |= 1;
                            amjr amjrVar82 = (amjr) aozyVar.s();
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar2 = (amfr) amfqVar.b;
                            amjrVar82.getClass();
                            amfrVar2.bc = amjrVar82;
                            amfrVar2.f |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                            maqVar.n(amfqVar);
                        }
                    };
                    break;
                case EXECUTE_IN_TRANSACTION:
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amjr amjrVar10 = (amjr) createBuilder.b;
                    amjrVar10.c = 5;
                    amjrVar10.b = 1 | amjrVar10.b;
                    final xnv xnvVar2222222 = (xnv) this.c.b();
                    final long millis2222222 = xnvVar2222222.d().toMillis();
                    final long a2222222 = xnvVar2222222.a();
                    agngVar = new agng() { // from class: uda
                        @Override // defpackage.agng
                        public final void a() {
                            udb udbVar = udb.this;
                            ude udeVar2 = udeVar;
                            if (udeVar2.b == udf.QUERY) {
                                udbVar.b.getAndDecrement();
                            }
                            aozy aozyVar = createBuilder;
                            maq maqVar = (maq) udbVar.a.b();
                            int intValue = udeVar2.f.intValue();
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j = a2222222;
                            xnv xnvVar22222222 = xnvVar2222222;
                            amjr amjrVar42 = (amjr) aozyVar.b;
                            amjr amjrVar52 = amjr.a;
                            amjrVar42.b |= 4;
                            amjrVar42.e = intValue;
                            long a22222222 = xnvVar22222222.a() - j;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j2 = millis2222222;
                            amjr amjrVar62 = (amjr) aozyVar.b;
                            amjrVar62.b |= 8;
                            amjrVar62.f = a22222222;
                            long millis22222222 = xnvVar22222222.d().toMillis() - j2;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            amjr amjrVar72 = (amjr) aozyVar.b;
                            amjrVar72.b |= 16;
                            amjrVar72.g = millis22222222;
                            amfq amfqVar = (amfq) amfr.a.createBuilder();
                            amfp amfpVar = amfp.DATABASE_OPERATION;
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar = (amfr) amfqVar.b;
                            amfrVar.i = amfpVar.dg;
                            amfrVar.b |= 1;
                            amjr amjrVar82 = (amjr) aozyVar.s();
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar2 = (amfr) amfqVar.b;
                            amjrVar82.getClass();
                            amfrVar2.bc = amjrVar82;
                            amfrVar2.f |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                            maqVar.n(amfqVar);
                        }
                    };
                    break;
                case EXECUTE_IN_TRANSACTION_BODY:
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amjr amjrVar11 = (amjr) createBuilder.b;
                    amjrVar11.c = 9;
                    amjrVar11.b = 1 | amjrVar11.b;
                    final xnv xnvVar22222222 = (xnv) this.c.b();
                    final long millis22222222 = xnvVar22222222.d().toMillis();
                    final long a22222222 = xnvVar22222222.a();
                    agngVar = new agng() { // from class: uda
                        @Override // defpackage.agng
                        public final void a() {
                            udb udbVar = udb.this;
                            ude udeVar2 = udeVar;
                            if (udeVar2.b == udf.QUERY) {
                                udbVar.b.getAndDecrement();
                            }
                            aozy aozyVar = createBuilder;
                            maq maqVar = (maq) udbVar.a.b();
                            int intValue = udeVar2.f.intValue();
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j = a22222222;
                            xnv xnvVar222222222 = xnvVar22222222;
                            amjr amjrVar42 = (amjr) aozyVar.b;
                            amjr amjrVar52 = amjr.a;
                            amjrVar42.b |= 4;
                            amjrVar42.e = intValue;
                            long a222222222 = xnvVar222222222.a() - j;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j2 = millis22222222;
                            amjr amjrVar62 = (amjr) aozyVar.b;
                            amjrVar62.b |= 8;
                            amjrVar62.f = a222222222;
                            long millis222222222 = xnvVar222222222.d().toMillis() - j2;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            amjr amjrVar72 = (amjr) aozyVar.b;
                            amjrVar72.b |= 16;
                            amjrVar72.g = millis222222222;
                            amfq amfqVar = (amfq) amfr.a.createBuilder();
                            amfp amfpVar = amfp.DATABASE_OPERATION;
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar = (amfr) amfqVar.b;
                            amfrVar.i = amfpVar.dg;
                            amfrVar.b |= 1;
                            amjr amjrVar82 = (amjr) aozyVar.s();
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar2 = (amfr) amfqVar.b;
                            amjrVar82.getClass();
                            amfrVar2.bc = amjrVar82;
                            amfrVar2.f |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                            maqVar.n(amfqVar);
                        }
                    };
                    break;
                default:
                    final xnv xnvVar222222222 = (xnv) this.c.b();
                    final long millis222222222 = xnvVar222222222.d().toMillis();
                    final long a222222222 = xnvVar222222222.a();
                    agngVar = new agng() { // from class: uda
                        @Override // defpackage.agng
                        public final void a() {
                            udb udbVar = udb.this;
                            ude udeVar2 = udeVar;
                            if (udeVar2.b == udf.QUERY) {
                                udbVar.b.getAndDecrement();
                            }
                            aozy aozyVar = createBuilder;
                            maq maqVar = (maq) udbVar.a.b();
                            int intValue = udeVar2.f.intValue();
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j = a222222222;
                            xnv xnvVar2222222222 = xnvVar222222222;
                            amjr amjrVar42 = (amjr) aozyVar.b;
                            amjr amjrVar52 = amjr.a;
                            amjrVar42.b |= 4;
                            amjrVar42.e = intValue;
                            long a2222222222 = xnvVar2222222222.a() - j;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            long j2 = millis222222222;
                            amjr amjrVar62 = (amjr) aozyVar.b;
                            amjrVar62.b |= 8;
                            amjrVar62.f = a2222222222;
                            long millis2222222222 = xnvVar2222222222.d().toMillis() - j2;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            amjr amjrVar72 = (amjr) aozyVar.b;
                            amjrVar72.b |= 16;
                            amjrVar72.g = millis2222222222;
                            amfq amfqVar = (amfq) amfr.a.createBuilder();
                            amfp amfpVar = amfp.DATABASE_OPERATION;
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar = (amfr) amfqVar.b;
                            amfrVar.i = amfpVar.dg;
                            amfrVar.b |= 1;
                            amjr amjrVar82 = (amjr) aozyVar.s();
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar2 = (amfr) amfqVar.b;
                            amjrVar82.getClass();
                            amfrVar2.bc = amjrVar82;
                            amfrVar2.f |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                            maqVar.n(amfqVar);
                        }
                    };
                    break;
            }
            return new ucz(agngVar, 0);
        }
        return null;
    }

    @Override // defpackage.uco
    public final boolean n() {
        a.by().booleanValue();
        if (((Long) this.d.b()).longValue() > 0 && ThreadLocalRandom.current().nextLong(r0) == 0.0d) {
            return true;
        }
        return false;
    }

    @Override // defpackage.uco
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.uco
    public final Cursor a(Cursor cursor, ude udeVar) {
        return cursor;
    }
}
