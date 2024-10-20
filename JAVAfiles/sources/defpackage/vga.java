package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vga implements vgf {
    private static final alwo b = alwo.o("BugleGroupManagement");
    static final alhr a = uuh.x(213466833, "send_mms_group_upgrade_capability_during_tachyon_registration");

    @Override // defpackage.vgf
    public final akul a(aozy aozyVar, msh mshVar, int i) {
        if (!((Boolean) ((utz) a.get()).e()).booleanValue()) {
            ((alwl) b.m().h("com/google/android/apps/messaging/shared/net/handler/decorators/MmsGroupUpgradeDecorator", "decorate", 40, "MmsGroupUpgradeDecorator.java")).q("Not sending the MMS group upgrade capability during Tachyon registration. Feature is disabled by Phenotype.");
            return aktp.ag(aozyVar);
        }
        ((alwl) b.m().h("com/google/android/apps/messaging/shared/net/handler/decorators/MmsGroupUpgradeDecorator", "decorate", 49, "MmsGroupUpgradeDecorator.java")).q("Decorating Tachyon register data with the MMS group upgrade capability.");
        aqhz aqhzVar = ((aqep) aozyVar.b).l;
        if (aqhzVar == null) {
            aqhzVar = aqhz.a;
        }
        aozy builder = aqhzVar.toBuilder();
        builder.bO(vbe.MMS_GROUP_UPGRADE_METRICS_COLLECTION.g);
        aqhz aqhzVar2 = (aqhz) builder.s();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqep aqepVar = (aqep) aozyVar.b;
        aqhzVar2.getClass();
        aqepVar.l = aqhzVar2;
        aqepVar.b |= 8;
        return aktp.ag(aozyVar);
    }
}
