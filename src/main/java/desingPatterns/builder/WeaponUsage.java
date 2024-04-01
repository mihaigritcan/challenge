package desingPatterns.builder;

import java.util.List;

public class WeaponUsage {
    public static void main(String[] args) {
        final Weapon laserGun=new Weapon.Builder()
                .withDamage(123)
                .withName("Laser Gun")
                .withDurability(50L)
                .withPerks(List.of("Color:red"))
                .build();
    }
}
