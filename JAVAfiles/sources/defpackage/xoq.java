package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import org.chromium.net.ConnectionMigrationOptions;
import org.chromium.net.CronetEngine;
import org.chromium.net.DnsOptions;
import org.chromium.net.QuicOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xoq extends arrp implements arqg {
    final /* synthetic */ aiqj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoq(aiqj aiqjVar) {
        super(0);
        this.a = aiqjVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [por, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        CronetEngine.Builder builder;
        aiqj aiqjVar = this.a;
        alvw d = ((aluw) aiqjVar.b).d();
        d.X(alwp.a, "BugleFileTransfer");
        ((alvg) d.h("com/google/android/apps/messaging/shared/transfer/cronet/BugleQuicCronetEngine", "getCronetEngineInternal", 54, "BugleQuicCronetEngine.kt")).q("Initializing BugleQuicCronetEngine.");
        if (aiqjVar.k.a()) {
            builder = ((vdq) aiqjVar.g).a().createBuilder();
            builder.getClass();
        } else {
            builder = new CronetEngine.Builder((Context) aiqjVar.a);
        }
        builder.enableHttp2(true);
        builder.enableQuic(((ansy) ((noc) aiqjVar.i).a.b()).e("bugle.enable_quic_in_tachygram_file_upload"));
        if (((ansy) ((noe) aiqjVar.d).a.b()).e("bugle.enable_stale_dns_in_tachygram_file_upload")) {
            alvw d2 = ((aluw) aiqjVar.b).d();
            d2.X(alwp.a, "BugleFileTransfer");
            ((alvg) d2.h("com/google/android/apps/messaging/shared/transfer/cronet/BugleQuicCronetEngine", "getCronetEngineInternal", 67, "BugleQuicCronetEngine.kt")).q("Configuring CronetEngine with staleDnsOptions");
            DnsOptions.Builder builder2 = DnsOptions.builder();
            builder2.enableStaleDns(true);
            builder2.useBuiltInDnsResolver(true);
            builder2.preestablishConnectionsToStaleDnsResults(true);
            builder2.persistHostCache(true);
            DnsOptions.StaleDnsOptions.Builder builder3 = DnsOptions.StaleDnsOptions.builder();
            builder3.useStaleOnNameNotResolved(true);
            Object b = ((xop) aiqjVar.c).e.b();
            b.getClass();
            builder3.allowCrossNetworkUsage(((Boolean) b).booleanValue());
            Object b2 = ((xop) aiqjVar.c).c.b();
            b2.getClass();
            builder3.setFreshLookupTimeoutMillis(((Number) b2).longValue());
            Object b3 = ((xop) aiqjVar.c).d.b();
            b3.getClass();
            builder3.setMaxExpiredDelayMillis(((Number) b3).longValue());
            builder2.setStaleDnsOptions(builder3.build());
            builder.setDnsOptions(builder2.build()).getClass();
        }
        if (((ansy) ((nob) aiqjVar.f).a.b()).e("bugle.enable_quic_hints_in_tachygram_file_upload")) {
            aiut.b();
            File file = new File(((Context) aiqjVar.a).getCacheDir(), "bugle_cronet_cache");
            if (!file.isDirectory() && !file.mkdir()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            CronetEngine.Builder storagePath = builder.setStoragePath(file.getAbsolutePath());
            Object b4 = ((xop) aiqjVar.c).b.b();
            b4.getClass();
            storagePath.enableHttpCache(2, ((Number) b4).longValue());
            apax apaxVar = ((aplg) ((xop) aiqjVar.c).a.b()).b;
            apaxVar.getClass();
            alvw d3 = ((aluw) aiqjVar.b).d();
            d3.X(alwp.a, "BugleFileTransfer");
            ((alvg) d3.h("com/google/android/apps/messaging/shared/transfer/cronet/BugleQuicCronetEngine", "configureQuicHints", 126, "BugleQuicCronetEngine.kt")).t("Configuring CronetEngine with quic hints: %s", apaxVar);
            Iterator<E> it = apaxVar.iterator();
            while (it.hasNext()) {
                builder.addQuicHint((String) it.next(), 443, 443);
            }
        }
        if (((ansy) ((noa) aiqjVar.e).a.b()).e("bugle.enable_quic_connection_migration_in_tachygram_file_upload")) {
            ConnectionMigrationOptions.Builder builder4 = ConnectionMigrationOptions.builder();
            builder4.enableDefaultNetworkMigration(true);
            builder.setConnectionMigrationOptions(builder4.build()).getClass();
        }
        if (((ansy) ((nod) aiqjVar.h).a.b()).e("bugle.enable_quic_options_in_tachygram_file_upload")) {
            armf armfVar = ((xop) aiqjVar.c).f;
            QuicOptions.Builder builder5 = QuicOptions.builder();
            Object b5 = armfVar.b();
            b5.getClass();
            builder5.setRetransmittableOnWireTimeoutMillis(((Number) b5).longValue());
            builder.setQuicOptions(builder5.build()).getClass();
        }
        CronetEngine build = builder.build();
        build.getClass();
        return build;
    }
}
