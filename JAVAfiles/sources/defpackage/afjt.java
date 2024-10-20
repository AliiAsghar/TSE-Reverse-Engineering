package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afjt {
    public static final akyr a;

    static {
        aixn aixnVar = new aixn();
        aixnVar.a("\n        CREATE TABLE `usages` (\n          `type` TEXT NOT NULL,\n          `value` TEXT NOT NULL,\n          `context` TEXT NOT NULL,\n          `time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP\n        )");
        aixnVar.a("\n          CREATE INDEX `type` ON `usages`(`type`)\n          ");
        aixnVar.a("\n        ALTER TABLE `usages` ADD COLUMN `search_term` TEXT DEFAULT NULL\n        ");
        aixnVar.a("\n          CREATE INDEX `usages_type` ON `usages`(`type`)\n          ");
        a = aixnVar.b();
    }
}
